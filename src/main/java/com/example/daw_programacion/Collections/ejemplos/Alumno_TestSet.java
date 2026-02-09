package com.example.daw_programacion.Collections.ejemplos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Alumno_TestSet {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnoArrayList = new ArrayList<>();
        HashSet<Alumno> alumnoHashSet = new HashSet<>();
        Alumno alumno1 = new Alumno("Ana", "Blanco", 2002, 10, 12);
        Alumno alumno2 = new Alumno("Ana", "Blanco", 2002, 10, 12);
        Alumno alumno3 = new Alumno("Pablo", "Blanco", 2002, 10, 12);
        Alumno alumno4 = new Alumno("Jack", "Blanco", 2002, 10, 12);
        Alumno alumno5 = new Alumno("Olie", "Blanco", 2002, 10, 12);


        alumnoArrayList.add(alumno1);
        alumnoArrayList.add(alumno1);
        //System.out.println(alumnoArrayList);
        // there are two Ana in alumnoArrayList
        // [Alumno{firstName='Ana', lastName='Blanco', year=2002, month=10, date=12}, Alumno{firstName='Ana', lastName='Blanco', year=2002, month=10, date=12}]


        alumnoHashSet.add(alumno1);
        alumnoHashSet.add(alumno1); // try adding the same object
        //System.out.println(alumnoHashSet);
        // there is only one Ana!
        // [Alumno{firstName='Ana', lastName='Blanco', year=2002, month=10, date=12}]

        alumnoHashSet.add(alumno2);
        alumnoHashSet.add(alumno3);
        alumnoHashSet.add(alumno4);
        alumnoHashSet.add(alumno5);

        // How to iterate in HashSet 1
        for (Alumno alumno : alumnoHashSet) {
            System.out.println(alumno);
        }

        // How to iterate in HashSet 2
        System.out.println(alumnoHashSet);

        // How to iterate in HashSet 3
        Iterator<Alumno> alumnoIterator = alumnoHashSet.iterator();
        while(alumnoIterator.hasNext()){
            System.out.println(alumnoIterator.next());
        }
    }
}
