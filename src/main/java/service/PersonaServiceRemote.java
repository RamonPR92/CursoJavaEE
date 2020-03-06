/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.ejb.Remote;
import domain.Persona;

/**
 *
 * @author rperez
 */
//Es necesario desplegarlo en el servidor
@Remote
public interface PersonaServiceRemote {
    
    public List<Persona> listarPersonas();
    
    public  Persona encontrarPersonaPorId(int idPersona);
    
    public Persona encontrarPersonaPorEmail(String email);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
}
