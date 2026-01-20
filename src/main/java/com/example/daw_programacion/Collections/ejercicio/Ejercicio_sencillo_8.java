package com.example.daw_programacion.Collections.ejercicio;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Stack;

public class Ejercicio_sencillo_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int inputCopy = input;

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        while(input>0){
            queue.push(input%10);
            input /= 10;
        }

        boolean isPalindrome = true;
        while(inputCopy>0){
            if(inputCopy%10 != queue.pop()){
                isPalindrome = false;
                break;
            }
            inputCopy /= 10;
        }

        System.out.println(isPalindrome);
    }
}
