package com.example.daw_programacion.Unit2;

import java.util.Scanner;

public class Ejercicio2_while {
    public static void main(String[] args) {

        //1. Factorial
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero: " );
        int input = sc.nextInt();
        int resulto = 1;

        while( input > 0 ){
           resulto *= input;
            input--;
        }
        System.out.println("Resulto: " + resulto);
*/

        //2. Factorial con for
/*        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero: " );
        int input = sc.nextInt();
        int resulto = 1;

        for(int i=1; i<=input; i++){
            resulto *= i;
        }
        System.out.println("Resulto: " + resulto);
*/

        //3. Contraseña
/*
        Scanner sc = new Scanner(System.in);
        char input;
        int count = 0;

        do{
            System.out.println("Introduce contraseña: " );
            input = sc.next().charAt(0);
            count++;

            if('A' == input){
                System.out.println("Your password is correct. You are logged in.");
                break;
            }

            if(count == 3){
                System.out.println("Your opportunity is OVER");
                break;
            }
        }while( input != 'A');
*/


        //4. continue
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if (i == 3) continue;
            if (i == 4) break;
            System.out.println(i);
        }
    }
}
