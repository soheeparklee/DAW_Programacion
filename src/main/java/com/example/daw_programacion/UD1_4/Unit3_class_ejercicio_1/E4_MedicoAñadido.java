package com.example.daw_programacion.UD1_4.Unit3_class_ejercicio_1;

public class E4_MedicoAñadido {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private String numeroDocumentoIdentidad;
    private String especialidad;

    public E4_MedicoAñadido(){
        this.nombre = "John";
        this.apellido = "Doe";
        this.edad = 40;
        this.casado = false;
        this.numeroDocumentoIdentidad = "A1234567890Z";
        this.especialidad = "Dermatologia";
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setCasado(boolean casado){
        this.casado = casado;
    }

    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad){
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public int calculoParaMultiploEdad(){
        int edad = this.edad;
        int resulto = 5 - (edad % 5);
        return resulto;
    }
}
