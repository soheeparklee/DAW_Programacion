package com.example.daw_programacion.UD1_4.Unit1_tarea_ejercicio;

public class Alumno {
    private String nombre;
    private String apellido;
    private Turno turno;

    //constructores
    public Alumno(String apellido, String nombre, Turno turno) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.turno = turno;
    }

    public Alumno() {
    }

    //getters & strings
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    //toString

    @Override
    public String toString() {
        return "Alumno{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", turno=" + turno +
                '}';
    }
}
