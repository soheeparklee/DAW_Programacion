package com.example.daw_programacion.UD1_4.Unit3_class.alumno;

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

    public void setTurno(Turno t){
        this.turno = t;
    }
}
