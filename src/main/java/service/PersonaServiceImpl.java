/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author rperez
 */
@Stateless
public class PersonaServiceImpl implements PersonaService{

    @Override
    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1, "Ramon", "Perez", "ramonpr92@hotmail.com", "3317572094"));
        personas.add(new Persona(2, "Ignacio", "Perez", "nachopr92@hotmail.com", "3317572094"));
        personas.add(new Persona(3, "Lalo", "Perez", "lalopr92@hotmail.com", "3317572094"));
        personas.add(new Persona(4, "Margarita", "Perez", "margaritapr92@hotmail.com", "3317572094"));
        return personas;    
    }

    @Override
    public Persona encontrarPersonaPorId(int idPersona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Persona encontrarPersonaPorEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registrarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarPersona(Persona persona) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
