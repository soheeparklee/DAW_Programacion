package com.example.daw_programacion.Test_Dec.ArrayExercicio;

import java.util.Random;

//16. Temperatura hotel
public class Ejercicio_Array_16 {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        hotel.asignar();
        //hotel.monstar();

        System.out.println(hotel.masFrioCaliente());

        System.out.println(hotel.calcular(1));
        System.out.println(hotel.calcular(2));

    }
}
