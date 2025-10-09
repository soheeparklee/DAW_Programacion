package com.example.daw_programacion.Unit3_class;

public class Alumno {
    String nombre;
    String apellido;
    Turno turno;

    public Alumno(String nombre, String apellido, Turno turno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.turno = turno;
    }

    public String getNombre(){
        return this.nombre;
    }
}
