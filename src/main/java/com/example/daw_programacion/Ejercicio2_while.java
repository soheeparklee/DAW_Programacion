package com.example.daw_programacion;

import java.util.Scanner;

public class Ejercicio2_while {
    public static void main(String[] args) {

        //1. Factorial
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero: " );
        int input = sc.nextInt();
        int resulto = 1;

        while( input > 0 ){
           resulto *= input;
            input--;
        }
        System.out.println("Resulto: " + resulto);
    }
}
