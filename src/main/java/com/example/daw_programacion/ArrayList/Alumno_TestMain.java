package com.example.daw_programacion.ArrayList;

import java.util.ArrayList;

public class Alumno_TestMain {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnosList = new ArrayList<>();
        Alumno alumno1 = new Alumno("Ana", "Blanco", 2002, 10, 12);
        Alumno alumno2 = new Alumno("Mina", "Rojo", 1899, 11, 02);
        Alumno alumno3 = new Alumno("Pablo", "Blanco", 2002, 10, 12);
        Alumno alumno4 = new Alumno("Jack", "Blanco", 2002, 10, 12);
        Alumno alumno5 = new Alumno("Olie", "Blanco", 2002, 10, 12);

        alumnosList.add(alumno1);
        alumnosList.add(alumno2);
        alumnosList.addFirst(alumno4);
        alumnosList.add(1, alumno3);

        for (Alumno alumno : alumnosList) {
            System.out.println(alumno);
        }

        for (int i = 0; i < alumnosList.size(); i++) {
            System.out.println(alumnosList.get(i));
        }


        System.out.println(alumnosList);


    }
}
