package com.example.daw_programacion.Unit2;

import java.awt.*;
import java.util.Scanner;

public class Ejercicio2_UD2 {
    public static void main(String[] args) {
        //28. Encuentra palíndromo
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto: ");
        String input = sc.nextLine().toLowerCase();

        StringBuffer sb = new StringBuffer(input);
        String reverse = sb.reverse().toString();

        if(input.equals(reverse)) System.out.println("La cadena es un palíndromo.");
        else System.out.println("La cadena NO es un palíndromo.");
*/
        //27. Verificación requisitos (uso de continue)
/*
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean toContinue = true;
        int aceptadaCount = 0;
        while(toContinue){
            for(int i=1; i<5; i++) {
                System.out.println("------------------ Verificación para el usuario " + i + ": ------------------");
                System.out.println("Ingrese su edad: ");
                int edad = sc.nextInt();
                count++;

                if (count == 4) {
                    toContinue = false;
                }

                if (edad < 21) {
                    System.out.println("Acceso denegado. Debe tener al menos 21 años.");
                    continue;
                }

                System.out.println("Ingrese años de experiencia: ");
                int experiencia = sc.nextInt();
                if (experiencia < 2) {
                    System.out.println("Acceso denegado. Debe tener al menos 2 años de experiencia.");
                    continue;
                }

                if(edad >=21 && experiencia >=2){
                    System.out.println("Inscripción aceptada.");
                    aceptadaCount++;
                }


            }
            System.out.println("*********** Total de usuarios aceptados: " + aceptadaCount + " ***********");
        }
*/

        //26. Cajero automático con PIN y límite de intentos (uso de break)
/*        Scanner sc = new Scanner(System.in);
        int input;
        int count = 0;
        final int PIN = 5678;
*/

        //26-1. Solution do-while
/*        do{
            count++;
            System.out.println("Ingrese su PIN: ");
            input = sc.nextInt();

            if(input == PIN){
                System.out.println("Acceso concedido.");
                break;
            }else if(count == 3){
                System.out.println("Cuenta bloqueada por exceso de intentos fallidos.");
                break;
            }else{
                System.out.println("PIN incorrecto. Inténtelo de nuevo. ");
            }
        }while(count < 3);
*/
        //26-2. Solution for
/*
        for(int attemps = 0; attemps < 3; attemps++){
            System.out.println("Ingrese su PIN: ");
            input = sc.nextInt();

            if(input == PIN){
                System.out.println("Acceso concedido.");
                return;
            }else{
                System.out.println("PIN incorrecto. Inténtelo de nuevo. ");
            }
        }
        System.out.println("Cuenta bloqueada por exceso de intentos fallidos.");
*/

        //25. Localiza dígito
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        int entero = sc.nextInt();
        String enteroStr = String.valueOf(entero);

        System.out.println("Introduzca un dígito: ");
        int digito = sc.nextInt();
        char digitoChar = String.valueOf(digito).charAt(0);

        String resulto = "";


        for(int i=0; i<enteroStr.length(); i++){
            if(digitoChar == enteroStr.charAt(i)){
                resulto += String.valueOf(i+1) + " ";
            }
        }

        System.out.println("Contando de izquierda a derecha, el " + digitoChar +  " aparece dentro de " + enteroStr +   " en las siguientes posiciones: " + resulto);
*/
        //24. Separar dígitos pares e impares de dos números

        //23. Fibonacci
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Te enseño los primeros n términos de la serie de Fibonacci: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        int third;

        if(n >= 1) System.out.println(first);
        if(n >= 2) System.out.println(second);

        int count = 3;
        while(count <= n){
            third = first + second;
            System.out.println(third);
            first = second;
            second = third;
            count++;
        }
*/
        //22. Dibujar figuras









    }
}
