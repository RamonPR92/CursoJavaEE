/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domain.Persona;
import java.util.List;

/**
 *
 * @author rperez
 */
public interface PersonaDao {
    
    public List<Persona> findAllPersonas();
    
    public Persona findPersonaById(int id);
    
    public Persona findPersonaByEmail(String email);
    
    public void insertPersona(Persona persona);
    
    public void updatePersona(Persona persona);
    
    public void deletePersona(Persona persona);
}
