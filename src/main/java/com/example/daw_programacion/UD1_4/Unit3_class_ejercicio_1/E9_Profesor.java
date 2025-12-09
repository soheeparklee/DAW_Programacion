package com.example.daw_programacion.UD1_4.Unit3_class_ejercicio_1;

public class E9_Profesor {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private boolean espcialista;

    public E9_Profesor(String nombre, String apellido, int edad, boolean casado, boolean espcialista){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
        this.espcialista = espcialista;
    }

    public E9_Profesor() {
        this.nombre = "John";
        this.apellido = "Doe";
        this.edad = 50;
        this.casado = false;
        this.espcialista = false;
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

    public boolean isEspcialista() {
        return espcialista;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public void setEspcialista(boolean espcialista) {
        this.espcialista = espcialista;
    }


}
