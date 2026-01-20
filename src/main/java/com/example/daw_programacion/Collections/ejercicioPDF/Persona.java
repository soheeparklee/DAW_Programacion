package com.example.daw_programacion.Collections.ejercicioPDF;

public class Persona {
    private String nombre;
    private String apellido;
    private int año;

    public Persona(String nombre, String apellido, int año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.año = año;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", año=" + año +
                '}';
    }
}
