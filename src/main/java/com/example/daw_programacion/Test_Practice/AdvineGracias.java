package com.example.daw_programacion.Test_Practice;

import org.yaml.snakeyaml.nodes.ScalarNode;

import java.util.Random;
import java.util.Scanner;

public class AdvineGracias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int original = random.nextInt(99) + 1;
        System.out.println(original);

        int guess;
        do{
            System.out.print("Advine gracias un número: ");
            guess = sc.nextInt();
            if(Math.max(original, guess) == original){
                System.out.println("Mayor");
            }else{
                System.out.println("Menor");
            }
        }while(guess != original);

        System.out.println("Muy bien! Answer era " + original);
    }
}
