package com.example.daw_programacion.Unit3_class_ejercicio;

public class E1_Person {
    private String nombre;
    private String apellidos;
    private int edad;
    private boolean casado;
    private String numeroDocumentoIdentidad;

    public E1_Person(String nombre, String apellidos, int edad, boolean casado, String numeroDocumentoIdentidad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.casado = casado;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCasado() {
        return casado;
    }

    public String getNumeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad) {
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }
}
