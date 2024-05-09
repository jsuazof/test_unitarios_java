package com.example.repositorio;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.beans.Transient;

import com.example.modelo.Persona;

public class RepositorioPersonaTest {
    private RepositorioPersona repositorioPersona = mock(RepositorioPersona.class);

    @Test 
    public void testCrearPersona(){
        Persona persona = new Persona("Joaquin", "12123456-9");
    when(repositorioPersona.crearPersona(null).thenReturn("Ok");
    String crearPersonaRes = repositorioPersona.crearPersona(persona);
    assertEquals("Ok", crearPersonaRes);
    verify(repositorioPersona).crearPersona(persona);
    }

    @Test
    public  void testActualizarPersona(){
        //Persona persona = new Persona("Jorge", "22222525-3");
        Persona persona = null;
        when(repositorioPersona.actualizarPersona(persona)).thenReturn("Ok");
        String actualizarPersonaRes = repositorioPersona.actualizarPersona(persona);
        assertEquals("Ok", actualizarPersonaRes);
        verify(repositorioPersona).actualizarPersona(persona);
    }

    @Test 
    public void testEliminarPersona(){
        Persona persona = new Persona("12156156-8","Peiro");
        when(repositorioPersona.eliminarPersona(persona)).thenReturn("Ok");
        String eliminarPersonaRes = repositorioPersona.eliminarPersona(persona);
        assertEquals("Ok", eliminarPersonaRes);
        verify(repositorioPersona).eliminarPersona(persona);
    }
}
