package com.example.daw_programacion.Test_Dec.Char;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio_Expresiones {
    public static void main(String[] args) {
        //10. Procesador de log avanzado
        String[] logs = {
                "2024-03-15 14:30:25 [INFO] Usuario logueado: admin",
                "2024/03/15 14:31:02 [ERROR] Conexión fallida a BD",
                "15-03-2024 14:32:15 [WARN] Memoria baja: 85%",
                "2024.03.15 14:33:44 [DEBUG] Query ejecutada en 120ms",
                "InvalidLog sin formato"
        };

        Pattern pattern = Pattern.compile(
                "^(\\d{2,4}[-/.]\\d{2}[-/.]\\d{2,4})\\s" +
                "(\\d{2}:\\d{2}:\\d{2}\\s)" +
                "\\[(INFO|ERROR|WARN|DEBUG)]\\s" +
                "(.+)$");


        int countValid = 0, countInvalid = 0;
        for (String log : logs) {
            Matcher matcher = pattern.matcher(log);

            if(matcher.matches()){
                String date = matcher.group(1);
                String time = matcher.group(2);
                String level = matcher.group(3);
                String message = matcher.group(4);

                System.out.println("Date: " + date);
                System.out.println("Time: " + time);
                System.out.println("Level: " + level);
                System.out.println("Message: " + message);
                System.out.println("Valid log count: " + countValid);
                System.out.println("--------------------------");

                countValid++;
            }else{
                System.out.println("Invalid log count: " + countInvalid);
                countInvalid++;
            }
        }

        System.out.println(countValid + " " + countInvalid);


    }

}
