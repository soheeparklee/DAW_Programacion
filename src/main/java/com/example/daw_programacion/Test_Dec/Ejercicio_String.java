package com.example.daw_programacion.Test_Dec;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio_String {
    public static void main(String[] args) {
        //1. Remove all
/*
        String input1 ="a. bfs,djkf dklnlfs,sdns.sdsdv sdsddlkn";
        String strReplace = input1.replace(".", "").replace(",", "").replace("\s", "");

        Pattern pattern = Pattern.compile("[,\\.\\s]");
        Matcher matcher = pattern.matcher(input1);
*/

        //2. Palindromo
        String[] palabras = {
                "Anita lava la tina" ,
                "Luz azul" ,
                "Hola" ,
                "A man a plan a canal Panama"
        };

        //2-1. stringbuilder
        for (String palabra : palabras) {
            palabra = palabra.toLowerCase().replaceAll("[\\s]", "");
            StringBuilder sb = new StringBuilder(palabra);
            StringBuilder sbReversed = new StringBuilder(sb).reverse();

            System.out.println(sb.toString().equals(sbReversed.toString()));
        }

        //2-2. chatAt
        for (String palabra : palabras) {
            palabra = palabra.toLowerCase().replaceAll("[\\s]", "");
            int left = 0;
            int right = palabra.length()-1;
            boolean isPalindromo = true;
            while(left < right){
                if(palabra.charAt(left) != palabra.charAt(right)){
                    isPalindromo = false;
                    break;
                }
                left++;
                right--;
            }
            System.out.println(isPalindromo);
        }


        //3. String friends
        String[] pares = {
                "hello" , "hallo" ,
                "java" , "javascript" ,
                "pattern" , "patron" ,
                "abc" , "xyz"
        };




    }
}
