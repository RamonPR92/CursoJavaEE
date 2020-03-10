/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import data.PersonaDao;
import domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author rperez
 */
@Stateless
public class PersonaServiceImpl implements PersonaService{

    @Inject
    private PersonaDao personaDao;
    
    @Override
    public List<Persona> listarPersonas() {
        return personaDao.findAllPersonas();    
    }

    @Override
    public Persona encontrarPersonaPorId(int idPersona) {
        return personaDao.findPersonaById(idPersona);
    }

    @Override
    public Persona encontrarPersonaPorEmail(String email) {
        return personaDao.findPersonaByEmail(email);
    }

    @Override
    public void registrarPersona(Persona persona) {
        personaDao.insertPersona(persona);
    }

    @Override
    public void modificarPersona(Persona persona) {
        personaDao.updatePersona(persona);
    }

    @Override
    public void eliminarPersona(Persona persona) {
        personaDao.deletePersona(persona);
    }
    
}
