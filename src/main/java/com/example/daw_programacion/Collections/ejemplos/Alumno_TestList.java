package com.example.daw_programacion.Collections.ejemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class Alumno_TestList {
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

        // How to iterate 1: use bucle
        for (Alumno alumno : alumnosList) {
            System.out.println(alumno);
        }

        for (int i = 0; i < alumnosList.size(); i++) {
            System.out.println(alumnosList.get(i));
        }


        //2. How to iterate 2: overload toString()
        System.out.println(alumnosList);

        // 3. How to iterate 3: Iterator
        Iterator<Alumno> alumnosIterator = alumnosList.iterator();
        while(alumnosIterator.hasNext()){
            System.out.println(alumnosIterator.next());
        }


    }
}
