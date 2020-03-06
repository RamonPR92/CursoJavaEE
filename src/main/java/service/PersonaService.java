/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Persona;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author rperez
 */
//Si el EJB es local no es necesario desplegarlo en el servidor
@Local
public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public  Persona encontrarPersonaPorId(int idPersona);
    
    public Persona encontrarPersonaPorEmail(String email);
    
    public void registrarPersona(Persona persona);
    
    public void modificarPersona(Persona persona);
    
    public void eliminarPersona(Persona persona);
}
