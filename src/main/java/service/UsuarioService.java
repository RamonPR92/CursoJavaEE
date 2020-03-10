/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author rperez
 */
@Local
public interface UsuarioService {
    
    public List<Usuario> listarUsuarios();
    
    public Usuario listarUsuarioPorId(int id);
    
    public void insertarUsuario(Usuario usuario);
    
    public void actualizarUsuario(Usuario usuario);
    
    public void eliminarUsuario(Usuario usuario);
    
}
