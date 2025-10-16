package com.example.daw_programacion.Unit3_class_ejercicio;

public class E8_Bombero {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private boolean espcialista;

    public E8_Bombero(String nombre, String apellido, int edad, boolean casado, boolean espcialista){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
        this.espcialista = espcialista;
    }

    public static void main(String[] args) {
        E8_Bombero bombero = new E8_Bombero("So Hee", "Park", 30, true, false);
    }
}
