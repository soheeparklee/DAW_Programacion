package com.example.daw_programacion.Test_Practice;

import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        System.out.println("Un número porfa: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int count = 0;
        for (int i = 1; i < input && count < input; i++) { // add count < input
            if(input % i == 0){
                count += i;
                System.out.println(i);
            }
        }

        if(count == input){
            System.out.println("Este numero es un número perfecto. ");
        }else{
            System.out.println("Este numero NO es un número perfecto. ");

        }
    }
}
