package com.example.daw_programacion.Generic;

public class GenericMethod {
    // Método genérico
    public static <T> void mostrar(T elemento) {
        System.out.println(elemento);
    }

    // Método genérico
    public static <T> int returnMethod(T elemento) {
        System.out.println(elemento);
        return 1;
    }

    // Método genérico
    public static <T> T returnT(T elemento) {
        System.out.println(elemento);
        return elemento;
    }

}


