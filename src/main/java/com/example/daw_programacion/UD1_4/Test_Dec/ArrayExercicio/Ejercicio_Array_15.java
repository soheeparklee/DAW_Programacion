package com.example.daw_programacion.UD1_4.Test_Dec.ArrayExercicio;

public class Ejercicio_Array_15 {
    public static void main(String[] args) {
        JuegoBarco tableroOriginal = new JuegoBarco();
        System.out.println(tableroOriginal.monstar());

        JuegoBarcoJugador jugador =new JuegoBarcoJugador();
        System.out.println(jugador.monstar());

        System.out.println(jugador.registrarDisparo(tableroOriginal, 1, 'B'));
        System.out.println(jugador.monstar());
    }
}
