package com.example.modelo;




public class Persona {

    private String rut;
    private String nombre;

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String rut, String nombre) {
        this.rut = rut;
        this.nombre = nombre;
    }

}
