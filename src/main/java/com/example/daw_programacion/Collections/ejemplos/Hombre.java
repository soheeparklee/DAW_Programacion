package com.example.daw_programacion.Collections;

import java.util.Comparator;

public class Hombre {
    private String nombre;
    private int edad;

    public Hombre(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}
