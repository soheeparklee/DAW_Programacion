package com.example.daw_programacion.Test_Practice_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleRegex {
    public static void main(String[] args) {
        String texto = "Mi email es usuario@example.com y mi otro email es admin@mail.org";
        // Compilamos el patrón para buscar correos electrónicos simples
        Pattern patron = Pattern.compile("[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,4}");
        // Creamos un matcher para buscar coincidencias en el texto
        Matcher matcher = patron.matcher(texto);
        // Buscamos todas las coincidencias y mostramos información
        while (matcher.find()) {
            System.out.println("Coincidencia encontrada: " + matcher.group()); // texto coincidente completo
            System.out.println("Comienzo en índice: " + matcher.start()); // índice inicio coincidencia
            System.out.println("Fin en índice: " + matcher.end()); // índice fin coincidencia
        }


/*       output
        Coincidencia encontrada: usuario@example.com
        Comienzo en índice: 12
        Fin en índice: 31

        Coincidencia encontrada: admin@mail.org
        Comienzo en índice: 51
        Fin en índice: 65

*/
    }
}