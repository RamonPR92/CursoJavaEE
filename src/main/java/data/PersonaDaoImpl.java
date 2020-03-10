/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author rperez
 */
@Stateless//Añade la inyeccion de dependencia
public class PersonaDaoImpl implements PersonaDao{

    //Se genera la inyeccion por medio de la unidad de persistencia indicada
    @PersistenceContext(unitName = "PersonaPU")
    EntityManager entityManager;
    
    @Override
    public List<Persona> findAllPersonas() {
        //Obtener personas por medio de un namedQuery
        return entityManager.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaById(int id) {
        return entityManager.find(Persona.class, id);
    }

    @Override
    public Persona findPersonaByEmail(String email) {
        //Se genera un query y se establece el parametro
        Query query = entityManager.createQuery("SELECT p FROM Persona WHERE p.email =: email");
        query.setParameter("email", email);
        return (Persona) query.getSingleResult();
    }

    @Override
    public void insertPersona(Persona persona) {
        entityManager.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        entityManager.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        //Para eliminar primero debemos tener bien sincronizado el objeto (merge) 
        //para luego eliminarlo (remove)
        entityManager.remove(entityManager.merge(persona));
    }
    
}
