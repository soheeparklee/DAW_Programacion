package com.example.daw_programacion.Test_Dec.Char;

import java.sql.Array;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejerjcicio_String {
    public static void main(String[] args) {
        //1. Contar vocales y consonantes

        String texto = "Hola Mundo";
        int vocales = 0;
        int consonantes = 0;
        String vocalesStr = "";
        String consonatesStr = "";

        Pattern pattern = Pattern.compile("[aeiouAEIOU]");
        Matcher matcher;

        for (char c : texto.toCharArray()) {
            matcher =  pattern.matcher(Character.toString(c));
            if(matcher.matches()){
                if(vocales == 0){
                    vocalesStr += c;
                }else{
                    vocalesStr += "," + c ;
                }
                vocales++;
            }else{
                if(c == ' '){
                }else{
                    if(consonantes == 0){
                        consonatesStr += c;
                    }else{
                        consonatesStr += "," + c;
                    }
                    consonantes++;
                }
            }
        }

        System.out.printf("vocales= %d (%s), consonantes= %d (%s)", vocales, vocalesStr, consonantes, consonatesStr );

        //2. Invertir cadena
/*
        String original = "Expresiones Regulares";

        original = original.replace(" ", "");

        //1. stringbuilder
        StringBuilder sb = new StringBuilder(original.replace(" ", ""));
        System.out.println("StringBuilder: " + sb.reverse());

        //2. string.charAt() and toCharArray();
        int left = 0;
        int right = original.length()-1;
        char[] originalChar = original.toCharArray();
        while(left< right){
            char temp = original.charAt(left);
            originalChar[left] = originalChar[right];
            originalChar[right] = temp;

            left++;
            right--;
        }

        for (char c : originalChar) {
            System.out.print(c);
        }
        System.out.println();

        //3. new String, concat
        String invertida = "";
        for (int i = original.length()-1; i >= 0 ; i--) {
            invertida += original.charAt(i);
        }
        System.out.println("invertida " + invertida);

*/

        //3. Palíndromo
/*
        String[] palabras = {
                "Anita lava la tina" ,
                "Luz azul" ,
                "Hola" ,
                "A man a plan a canal Panama"
        };

        for (String palabra : palabras) {
            palabra = palabra.toLowerCase().replaceAll(" ", "");
            int left = 0;
            int right = palabra.length()-1;
            boolean isPalindrome = true;
            while(left<right){
                if(palabra.charAt(left) != palabra.charAt(right)){
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }
            System.out.println(isPalindrome);
        }

*/


        //4. Busqueda y reemplazo condicional
/*
        String texto = "Java es un lenguaje. JavaScript es diferente. Tengo java en casa.";
        String buscar = "java";
        String reemplazar = "Python";

        //method 1_ use pattern
        Pattern pattern = Pattern.compile("(?i)\\b" + buscar + "\\b");
        Matcher matcher = pattern.matcher(texto);

        String result = matcher.replaceAll(reemplazar);
        System.out.println("Using pattern/matcher: " + result);

        //method 2_ use String.split()
        String[] textoArr = texto.split(" ");
        for (int i = 0; i < textoArr.length; i++) {
            if(textoArr[i].equalsIgnoreCase(buscar)){
                textoArr[i] = reemplazar;
            }
        }

        for (String s : textoArr) {
            System.out.print(s + " ");
        }
*/


        //5. Análisis de Frecuencia de Caracteres
/*
        String texto = "HelloWorld";
        int[] frecuencia = new int[256];

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            frecuencia[c]++;
        }

        for (int i = 0; i < frecuencia.length; i++) {
            if(frecuencia[i] > 0){
                System.out.println("'" + (char)i + "' aparece " +  frecuencia[i] + " veces");
            }
        }
*/

        //6. Validador de formato de telefono
/*
        String[] telefonos = {
                "123-456-7890" ,
                "(123) 456-7890" ,
                "1234567890" ,
                "12-34-56" ,
                "+34 912 345 678"
        };
        for (String telefono : telefonos) {
            //1. elimina espacios y caracters especiales
            telefono = telefono.replaceAll("[-()+\s]", "");

            //2. verifica que solo queden dígitos
            Pattern pattern = Pattern.compile("[\\d]{8,11}");
            Matcher matcher = pattern.matcher(telefono);
            if(matcher.matches()){
                System.out.println("válido");
            }else{
                System.out.println("inválido");
            }
        }
*/

        //7. Extractor de dominios de email
/*
        String[] emails = {
                "user@example.com" ,
                "admin@company.co.uk" ,
                "test.email@domain.org" ,
                "invalid.email.com" ,
                "another@test@multiple.com"
        };

        Pattern pattern = Pattern.compile("@");
        for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            //valid email
            int count = 0;
            while(matcher.find()){
                count++;
            }
            if(count == 1){
                //usa indexOf() para encontrar posicion de @
                int arrobaLocacation = email.indexOf("@");
                //extrae usario con subString()
                String usar = email.substring(0, arrobaLocacation);
                String usarResto = email.substring(arrobaLocacation);
                //extrae dominio con subString()
                int puntoLocation = usarResto.indexOf(".");
                String domino = usarResto.substring(1, puntoLocation);
                //extra extensión con lastIndexOf()
                String extension = usarResto.substring(puntoLocation);

                System.out.println("usar: " + usar + " dominio: " + domino + " extension: " + extension);

            }else if(count > 1){
                System.out.println("Invalido(más de un @)");

            }else{
                //not valid
                System.out.println("Invalido(sin @)");
            }
        }
*/

        //8. Formateador de Texto con limite de caracteres
        //method1_ stringbuffer
/*    String texto = "Las expresiones regulares es un tema que los programadores suelen posponer.";
        int maxCaracteres = 30;

        String[] splitArr = texto.split(" ");
        int count = 0;
*/
   /*
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < splitArr.length; i++) {
            int length = splitArr[i].length();
            if((count + length) <= maxCaracteres){
                count += length;
                sb.append(splitArr[i]);
                sb.append(" ");
            }else{
                System.out.println(sb);
                count = 0;
                count += length;
                sb = new StringBuilder();
                sb.append(splitArr[i]);
                sb.append(" ");
            }
        }
        if(!sb.isEmpty()) System.out.println(sb);

*/
/*
        String result = "";
        for (int i = 0; i < splitArr.length; i++) {
            String now = splitArr[i];
            //cabe en linea actual?
            if(now.length() + result.length() <= maxCaracteres){
                //case one: first letter
                if(result.length() == 0){
                    result = now;
                }else{
                    //case two: second letter onwards
                    result += " " + now;
                }
            }else{
                //no cabe en linea
                System.out.println(result);
                result = now;
            }
        }

*/

        //9. Comparador de Similitud de Cadenas
/*
        String[] pares = {
                "hello" , "hallo" ,
                "java" , "javascript" ,
                "pattern" , "patron" ,
                "abc" , "xyz"
        };

        for (int i = 1; i < pares.length ; i+=2) {
            char[] first = pares[i-1].toLowerCase().toCharArray();
            char[] second = pares[i].toLowerCase().toCharArray();
            int minLength = Math.min(first.length, second.length);
            int maxLength = Math.max(first.length, second.length);
            int count = 0;
            for (int j = 0; j < minLength; j++) {
                if(first[j] == second[j]){
                    count++;
                }
            }
            System.out.println(pares[i-1] + " vs " + pares[i] + " " + count*100/maxLength + "% similitud");
        }
*/


        //10. Procesador de comandos
/*
        String[] comandos = {
                "REVERSO:Hola" ,
                "CONTAR_VOCALES:Expresiones" ,
                "REEMPLAZAR:java,Python:Amo java" ,
                "MAYUSCULAS:transformar" ,
                "EXTRAER:2,5:Substring" ,
                "INVALIDO"
        };


        for (String comando : comandos) {
            //1. valida que contenga ':'
            if(comando.indexOf(':') > -1){
                String[] splitCommand = comando.split(":");
                String com = splitCommand[0];
                switch(com){
                    case "REVERSO" :
                        StringBuilder sb = new StringBuilder(splitCommand[1]);
                        System.out.println(comando + "->" + sb.reverse());
                        break;
                    case "CONTAR_VOCALES":
                        int count = 0;
                        Pattern pattern = Pattern.compile("([aeiouAEIOU])");
                        Matcher matcher = pattern.matcher(splitCommand[1]);

                        while(matcher.find()){
                            count++;
                        }

                        //for (char c : splitCommand[1].toCharArray()) {
                            //if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                            //    count++;
                            //}
                        //}
                        System.out.println(comando + "->" + count);
                        break;
                    case "REEMPLAZAR":
                        String[] subArr = splitCommand[1].split(",");
                        String reemplazar = splitCommand[2].replaceAll(subArr[0], subArr[1]);
                        System.out.println(comando + "->" +reemplazar);
                        break;
                    case "MAYUSCULAS":
                        System.out.println(comando + "->" + splitCommand[1].toUpperCase());
                        break;
                    default:
                        break;

                }
            }
        }
*/

    }
}
