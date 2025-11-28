package com.example.daw_programacion.Test_Dec;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio_Random {
    public static void main(String[] args) {
        // check that the read date matches the pattern dd/mm/yyyy
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Pattern pattern = Pattern.compile("[1-31]/[1-12]/[\\d]{4}");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
