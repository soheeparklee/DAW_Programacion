package com.example.daw_programacion.Unit3_class_ejercicio_2;

public class E4_Ordenador {
    private String name;
    private static String type = "WOO";

    public E4_Ordenador(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
