package com.example.daw_programacion.Collections.ejercicio;

import java.util.Objects;

public class Persona implements Comparable<Persona>{
    private String dni;
    private String apellido;
    private String nombres;
    private String sexo;
    private Integer edad;
    private Double peso;

    public Persona(String dni) {
        this.dni = dni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

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
    
/*    @Override
    public int compareTo(Persona o) {
        return this.apellido.charAt(0) > o.apellido.charAt(0) ? 1 : (this.apellido.charAt(0) == o.apellido.charAt(0)) ? 0 : -1;
    }*/

    @Override
    public int compareTo(Persona o){
        return this.apellido.compareToIgnoreCase(o.getApellido());
    }



    public String getDni() {
        return dni;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public String getSexo() {
        return sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public Double getPeso() {
        return peso;
    }
}
