package com.example.daw_programacion.UD1_4.Test_Practice_2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio134 {
    public static void main(String[] args) {
        //1. Numero perfecto
/*
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input <= 0){
            System.out.println("Acepte un numero positivo solo.");
        }

        int sum = 0;
        for (int i = 1; i < input; i++) {
            if(input % i == 0){
                sum +=i;
                System.out.println("divisor: " + i);
            }
        }

        if(sum == input){
            System.out.println(input+ " es un número perfecto.");
        }else{
            System.out.println(input+ " no es un número perfecto.");
        }

*/

        //3. Correo Electronico
/*
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] correos = new String[5];
        Pattern pattern = Pattern.compile("[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,4}");
        Matcher matcher = pattern.matcher(input);

        int index = 0;
        while(matcher.find() && index < correos.length){
            correos[index] = matcher.group();
            index++;
        }

        index = 0;
        for (String s : correos) {
            String[] correoArr = s.split("@");
            correos[index] = "www." + correoArr[1];
            System.out.println(correos[index]);
            index++;
        }

*/
        //4. Random, mayor menor
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int original = random.nextInt(0, 99)+1;

        int input;
        do{
            System.out.println("Un número 1~100");
            input = sc.nextInt();
            if(Math.max(original, input) == original){
                System.out.println("Mayor");
            }else if(Math.max(original, input) == input){
                System.out.println("Menor");
            }
        }while(input != original);

        System.out.println("Perfecto! El numero era " + original);
    }
}
