package com.example.daw_programacion;

import java.util.Scanner;

public class Ejercicio2_30 {
    public static void main(String[] args) {
        //21. ¿Qué sucederá?
        // Porque este pasa?
        // This is a problem with Scanner when mixing nextXXX() that do not consume newline and nextLine()
        // When I input nextInt() and press enter, enter is read to be the nextLine()
        // Resulting in returning the int and a blank line

        // solution_1
 /*       Scanner sc = new Scanner(System.in);

        System.out.println("Pone número: ");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Pone cadena: ");
        String cadena = sc.nextLine();

        System.out.println(numero);
        System.out.println(cadena);
*/
        // solution_2
/*        Scanner sc = new Scanner(System.in);

        System.out.println("Pone número: ");
        Integer numero = Integer.parseInt(sc.nextLine());

        System.out.println("Pone cadena: ");
        String cadena = sc.nextLine();

        System.out.println(numero);
        System.out.println(cadena);
*/

        //22. Modifícalo utilizando printf
/*
        int edad = 25;
        int años = 5;
        double salario = 3000.20;
        double incremento = 250.75;
        String nombre = "Ana";
        String apellido = "Garcia";
        char inicial = 'A';
        boolean esEmpleado = true;

        System.out.printf("Hay una chica que se llama %s, empienzando con un %c y su apellido es %s. Ella tiene %d edad y tiene %d años de experiencia. Su salario es %f y el incremento es %f. Es %b que ella es empleado. ", nombre, inicial, apellido, edad, años, salario, incremento, esEmpleado);
*/

        //23. Análisis de Ventas Semanales


    }
}
