package main.java.com.servicio;

import java.util.HashMap;
import java.util.Map;

import com.example.modelo.Persona;

public class ServicioPersona {

    private Map<String, String> personasDb = new HashMap<>();

    public String crearPersona(Persona persona){

        if (persona != null){
            
            personasDb.put(persona.getRut(), persona.getNombre());
            return "Persona creada";
        }
        else{
            return "Persona no creada";
        }
    }
    public String actualizarPersona(Persona persona){

        if (persona != null){
            
            personasDb.put(persona.getRut(), persona.getNombre());
            return "Persona actualizada";
        }
        else{
            return "Persona no actualizada";
        }
    }
    public Map<String, String>listarPersonas(){
        return personasDb;
    } 
    public String eliminarPersona(Persona persona){
        if (persona != null){
            personasDb.remove(persona.getRut());
            return "Persona eliminada";
        }else{
            return "Persona no eliminada";
        }
    }
}

