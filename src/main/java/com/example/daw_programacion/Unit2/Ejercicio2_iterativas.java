package com.example.daw_programacion.Unit2;

import java.util.Scanner;

public class Ejercicio2_iterativas {
    public static void main(String[] args) {
        //12. Dibuhar figuras

/*
         for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
*/

        //12. Modifique el código para que sea el usuario el que decida el número filas que tendrá el triángulo.

/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Put a number: ");
        int input = sc.nextInt();

        for(int i=1; i<=input; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
*/

        //12. Ingrese el número de filas para la pirámide hueca: triangulo 5
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Put a number: ");
        int input = sc.nextInt();

        for(int i=1; i<=input; i++){
            for(int j=input; j>= i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
*/

        //12. Ingrese el número de filas para la pirámide hueca: triangulo pequeño vacio 5
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Put a number: ");
        int input = sc.nextInt();

        for(int i=1; i<=input; i++){
            for(int j=input; j>=i; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=1; k<= i*2-1; k++){
                if(i != input){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            if(i != 1 ){
                System.out.print("*");
            }

            System.out.println();

        }
*/

        //12. Triangulo mas largp
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=i+1; k<= i*2-1; k++){
                if(i != 5){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            if(i != 1 ){
                System.out.print("*");
            }

            System.out.println();
            System.out.println();

        }

    }
}
