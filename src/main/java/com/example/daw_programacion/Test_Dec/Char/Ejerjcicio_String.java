package com.example.daw_programacion.Test_Dec.Char;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejerjcicio_String {
    public static void main(String[] args) {
        //1. Contar vocales y consonantes

        //9. Comparador de Similitud de Cadenas
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
