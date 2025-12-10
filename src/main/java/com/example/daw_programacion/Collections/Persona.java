package com.example.daw_programacion.Collections;

public class Persona implements Comparable<Persona>{
    String dni;
    String apellido;
    String nombres;
    String sexo;
    Integer edad;
    Double peso;

    public Persona(String dni, String apellido, String nombres, String sexo, Integer edad, Double peso) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombres = nombres;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "apellido='" + this.apellido + '\'' +
                '}';
    }

    @Override
    public int compareTo(Persona o) {
        return this.apellido.charAt(0) > o.apellido.charAt(0) ? 1 : (this.apellido.charAt(0) == o.apellido.charAt(0)) ? 0 : -1;
    }
}
