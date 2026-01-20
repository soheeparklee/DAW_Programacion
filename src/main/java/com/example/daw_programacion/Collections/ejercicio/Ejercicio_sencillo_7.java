package com.example.daw_programacion.Collections.ejercicio;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_sencillo_7 {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.println("Input num for inserting");
            input = sc.nextInt();
            queue.add(input);
        }while(input != 0);

        System.out.println("Input number for cifra");
        int cifra = sc.nextInt();
        Iterator<Integer> iterator = queue.iterator();

        int sum = 0;
        while(iterator.hasNext()){
            Integer now = iterator.next();
            if(cifra > sum){
                sum += now;
                iterator.remove();
                System.out.print(now + "+ ");
            }else{
                break;
            }
        }
        System.out.println("cifra: " + cifra + " sum: " + sum);



    }
}
