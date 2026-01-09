package com.example.daw_programacion.Collections.ejercicio;

import com.example.daw_programacion.Collections.Alumno;

import java.util.HashSet;
import java.util.Iterator;

public class Ejercicio_sencillo_4 {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Ana", "Blanco", 2002, 10, 12);
        Alumno alumno2 = new Alumno("Mina", "Rojo", 1899, 11, 02);
        Alumno alumno3 = new Alumno("Pablo", "Boy", 2002, 10, 12);
        Alumno alumno4 = new Alumno("Jack", "Blabla", 2002, 10, 12);
        Alumno alumno5 = new Alumno("Olie", "Car", 2002, 10, 12);
        Alumno alumonoCopia = new Alumno("Olie", "Car", 2002, 10, 12);

        HashSet<Alumno> alumnoHashSet = new HashSet<>();
        alumnoHashSet.add(alumno1);
        alumnoHashSet.add(alumno2);
        alumnoHashSet.add(alumno3);
        alumnoHashSet.add(alumno4);
        alumnoHashSet.add(alumno5);
        alumnoHashSet.add(alumonoCopia);
        System.out.println(alumno5.equals(alumonoCopia));
        System.out.println(alumnoHashSet);

        removeAlumno(alumnoHashSet, "Boy");
        System.out.println(alumnoHashSet);




    }

    public static boolean removeAlumno( HashSet<Alumno> alumnoHashSet, String lastName){
        Iterator<Alumno> alumnoIterator = alumnoHashSet.iterator();
        while(alumnoIterator.hasNext()){
            if(alumnoIterator.next().getLastName().equals(lastName)){
                alumnoIterator.remove();
                return true;
            }
        }
        return false;
    }
}
