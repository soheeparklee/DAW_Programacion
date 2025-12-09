package com.example.daw_programacion.UD1_4.Test_Dec;

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
/*        for (String palabra : palabras) {
            palabra = palabra.toLowerCase().replaceAll("[\\s]", "");
            StringBuilder sb = new StringBuilder(palabra);
            StringBuilder sbReversed = new StringBuilder(sb).reverse();

            System.out.println(sb.toString().equals(sbReversed.toString()));
        }*/

        //2-2. chatAt
/*
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
*/


        //3. String friends
/*        String[] pares = {
                "hello" , "hallo" ,
                "java" , "javascript" ,
                "pattern" , "patron" ,
                "abc" , "xyz",
                "abcde" , "abcde"

        };

        for (int i = 1; i < pares.length; i+=2) {
            String first = pares[i-1].toLowerCase();
            String second = pares[i].toLowerCase();

            int minLength = Math.min(first.length(), second.length());
            int maxLength = Math.max(first.length(), second.length());


            int count = 0;
            for (int j = 0; j < minLength; j++) {
                if(first.charAt(j) == second.charAt(j)){
                    count++;
                }
            }

            System.out.println("similitud de " + first + " " + second  +  ": " + (count*100)/maxLength);

        }*/

/*
// ⭐️
        String[] emails = {
                "user@example.com" ,
                "admin@company.co.uk" ,
                "test.email@domain.org" ,
                "invalid.email.com" ,
                "another@test@multiple.com"
        };
        Pattern pattern = Pattern.compile("([\\w.%+-]+)" +
                "(@)" +
                "([\\w.-]+\\.)" +
                "([a-zA-Z]{2,4})");
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            String user = "";
            String dominio = "";
            String extension = "";
            if(matcher.matches()){
                user = matcher.group(1);
                dominio = matcher.group(3);
                extension = matcher.group(4);
            }
            System.out.println(user + " ::: " + dominio + " ::: " + extension);
        }

*/
/*        String texto = "Las expresiones regulares es un tema que los programadores suelen posponer.";
        int maxCaracteres = 30;
        String[] strArr = texto.split(" ");

        int strLen = 0;
        String printStr = "";
        for (String s : strArr) {
            strLen += s.length();
            printStr += " " + s;
            if(strLen >= maxCaracteres){
                System.out.println(printStr);

                printStr = "";
                strLen = 0;
            }
        }*/

/*        String texto = "Java es un lenguaje. JavaScript es diferente. Tengo java en casa.";
        String buscar = "java";
        String reemplazar = "Python";

        String[] textoArr = texto.split(" ");
        for (int i = 0; i <textoArr.length ; i++) {
            if(textoArr[i].toLowerCase().equals(buscar)){
                textoArr[i] = reemplazar;
            }
        }

        for (String s : textoArr) {
            System.out.print(s + " ");
        }
        */



        int[][] intArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int row = intArray.length; //4
        int col = intArray[0].length; //3






    }
}
