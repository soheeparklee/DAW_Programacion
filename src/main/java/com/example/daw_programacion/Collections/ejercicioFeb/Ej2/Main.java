package com.example.daw_programacion.Collections.ejercicioFeb.Ej2;

public class Main {
    public static void main(String[] args) {
        Operacion<Integer> suma = new Suma();
        System.out.println(suma.calcular(5, 10));

        Operacion<String> concatenar = new Concatenar();
        System.out.println(concatenar.calcular("Hola", "Mundo"));
    }
}
