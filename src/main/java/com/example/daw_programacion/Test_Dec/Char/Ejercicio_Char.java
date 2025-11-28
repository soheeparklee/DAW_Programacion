package com.example.daw_programacion.Test_Dec.Char;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_Char {
    public static void main(String[] args) {
       /* ⚠️ pregunta para Tereza
       * cadena de caracteres significa String
       * frase significa String, sentence
        */
        //⚠️I want to see together
        // 12. Eliminar la última palabra
/*
        String frase = "Eliminar la última palabra";
        String[] fraseArray = frase.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fraseArray.length - 1; i++) {
            sb.append(fraseArray[i]);
            sb.append(" ");
        }

        System.out.println(sb);
*/


        //11. Contar el número de palabras de una frase
/*        String frase = "Me gusta programar. Y me gusta pizza y cocacola";
        String[] fraseArray = frase.split(" ");
        System.out.println(fraseArray.length);
*/
        //10. Lea una frase y muestra las palabras en orden inverso
/*        String frase = "Me gusta programar.";
        String[] fraseArray = frase.split(" ");
        int left = 0;
        int right = fraseArray.length-1;
        while(left<right){
                String temp = fraseArray[left];
                fraseArray[left] = fraseArray[right];
                fraseArray[right] = temp;
                left++;
                right--;
        }
        System.out.println(Arrays.toString(fraseArray));
*/

        //9. entrelazadas dos cadenas de caracteres
/*        String str1 = "abcdefg";
        String str2 = "1234";
        System.out.println(str1.concat(str2));
  */


        //8. Nombre Menu

/*
        Ejercicio_8_nombreArray nombreArray = new Ejercicio_8_nombreArray();
        nombreArray.introducirNombre();
        nombreArray.introducirNombre();
        nombreArray.introducirNombre();
        nombreArray.introducirNombre();
        nombreArray.introducirNombre();
        System.out.println(nombreArray.listarNombres());

        nombreArray.eliminarNombre();
        System.out.println(nombreArray.listarNombres());
        nombreArray.eliminarTodoNombres();
        System.out.println(nombreArray.listarNombres());

*/
        //7.
        //6. ⚠️ cadena??
/*        Scanner sc = new Scanner(System.in);
        String input;
        int max = Integer.MIN_VALUE;
        String result="";
        do{
            System.out.println("Pone un cadena: ");
            input = sc.nextLine();
            if(input.length() >= max){
                max = input.length();
                result = input;
            }

        }while(!input.equals("fin"));

        System.out.println(result);
*/

        //5. Diga está en mayúsculas o no
/*
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] charArr = input.toCharArray();
        boolean isMayuscula = false;
        for (char c : charArr) {
           if(c <= 90){
               isMayuscula = true;
           }else{
               isMayuscula = false;
           }
        }

        System.out.println("Esta en mayúsculas: " + isMayuscula);
*/

        //5-1. 하나라도 대문자이면 대문자, 하나라도 소문자이면 소문자
/*
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] charArr = input.toCharArray();
        boolean isAllMayuscula = true;
        for (char c : charArr) {
            if(Character.isLowerCase(c)){
                isAllMayuscula = false;
                break;
            }
        }
        System.out.println(isAllMayuscula);
*/

        //4. ⭐️palíndromo
        String input = "a.s dfghjk,ll,kjhgfd s.a";
        //String input ="a. bfs,djkf dklnlfs,sdns.sdsdv sdsddlkn";
        //1️⃣ method 1: use replace
        String strReplace = input.replace(".", "").replace(",", "").replace("\s", "");

        //2️⃣ method2: use pattern
        String regex = "[,\\.\\s]";
        String[] strSplitArray = input.split(regex);
        StringBuilder sb = new StringBuilder();
        for (String s : strSplitArray) {
            sb.append(s);
        }

        StringBuilder reverseSb = new StringBuilder(sb);
        System.out.println(sb.toString().equals(reverseSb.toString())); // false 👍🏻



    }
}
