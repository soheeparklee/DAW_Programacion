package com.example.daw_programacion.Unit4_Array;

import java.util.Random;

public class EjercicioRandom {
    public static void main(String[] args) {
        Random random1 = new Random(12345);
        Random random2 = new Random(12345);
        System.out.println("Números aleatorios con Math.random():");
        for (int i = 0; i < 10; i++) {
        // Math.random() devuelve double 0.0-1.0, convertimos a int 1-100
            int num = (int) (Math.random() * 1000000) + 1;
            System.out.print(num + " ");
        }
        //10 random double downcast into int printed

        /*System.out.println("\nNúmeros aleatorios con java.util.Random:");
        for (int i = 0; i < 10; i++) {
        // nextInt(100) genera 0-99, sumamos 1 para 1-100
            int num = random.nextInt(100) + 1;
            System.out.print(num + " ");
        }*/

        for (int i = 0; i < 10; i++) {
            boolean boo1 = random1.nextBoolean();
            boolean boo2 = random2.nextBoolean();
            System.out.print(boo1 + " " + boo2 + "\n");
        }
        //10 random int printed
    }
}
