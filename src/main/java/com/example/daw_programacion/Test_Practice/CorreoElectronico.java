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

        while(count < correos.length){
            while(matcher.find()){
                correos[count] = matcher.group();
                count++;
            }
        }

        for (String correo : correos) {
            System.out.println(correo);
        }

    }
}
