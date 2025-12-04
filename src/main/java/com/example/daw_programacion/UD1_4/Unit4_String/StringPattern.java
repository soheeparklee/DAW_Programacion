package com.example.daw_programacion.UD1_4.Unit4_String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPattern {
    public static void main(String[] args) {

        String frase2 = "ho-lahola mi numero es 4503749583";
        Pattern p2 = Pattern.compile("\\d+");
        Matcher m2 = p2.matcher(frase2);
        while(m2.find())
            System.out.println(m2.group());

        //ho
        //lahola
        //mi
        //numero
        //es
        //4503749583
        String frase1 = "ho-lahola mi numero es 4503749583";
        Pattern p1 = Pattern.compile("\\d+");
        Matcher m1 = p2.matcher(frase1);
        while(m1.find())
            System.out.println(m1.group());
        // 4503749583


    }
}
