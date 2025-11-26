package com.example.daw_programacion.Test_Practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorreoElectronico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pone linea");
        String input = sc.nextLine();
        String[] correos = new String[5];

        int count = 0;
        Pattern pattern = Pattern.compile("[\\w.%+-]+@[\\w.-]+\\.+[a-zA-Z]{2,4}");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find() && count < correos.length){ // need to put them together
                correos[count] = matcher.group();
                count++;
            }

/*        for (String correo : correos) {
            correo = correo.replaceFirst("^[^@]+@(.*)$", "www.$1");
            System.out.println(correo);
        }
*/


/*
        for (String correo : correos) {
            int index = 0;
            for (int i = 0; i <correo.length() ; i++) {
                if(correo.toCharArray()[i] == '@'){
                    index = i;
                    break;
                }
            }
            correo = "www." + correo.substring(index+1);
            System.out.println(correo);
        }
*/

        for (String correo : correos) {
            String[] splitArr = correo.split("@");
            correo = "www.".concat(splitArr[1]);
            System.out.println(correo);
        }


    }
}
