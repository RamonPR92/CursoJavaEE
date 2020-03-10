/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domain.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rperez
 */
@Stateless
public class UsuarioDaoImpl implements UsuarioDao{

    @PersistenceContext(name="WebPU")
    private EntityManager entityManager;
    
    @Override
    public List<Usuario> findAllUsuarios() {
        return entityManager.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario findUsuarioById(int id) {
        return (Usuario) entityManager.createNamedQuery("Usuario.findByIdUsuario").getSingleResult();
    }
    
     @Override
    public void insertarUsuario(Usuario usuario) {
        entityManager.persist(usuario);
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
       entityManager.merge(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        entityManager.remove(entityManager.merge(usuario));
    }
 
}
