package com.example.daw_programacion.Generic;

public class GenericMethodMain {
    public static void main(String[] args) {
        GenericMethod.mostrar("Hola"); // T es String
        GenericMethod.mostrar(42); // T es Integer
        GenericMethod.mostrar(3.14); // T es Double

        GenericMethod.returnT(10);
    }
}
