package com.example.daw_programacion.Collections.ejercicioPDF;

public class Ejercicio_2_Main {
    public static void main(String[] args) {
        Operacion<Integer> suma = new Suma();
        System.out.println(suma.calcular(5, 10)); // 15

        Operacion<String> concatenar = new Concatenar();
        System.out.println(concatenar.calcular("Hola", "Mundo")); // HolaMundo
    }
}
