package com.example.daw_programacion.Collections;

import java.util.ArrayDeque;

public class Alumno_TestQueue {
    public static void main(String[] args) {
        ArrayDeque<Alumno> alumnoDeque = new ArrayDeque<>();
        Alumno alumno1 = new Alumno("Ana", "Blanco", 2002, 10, 12);
        Alumno alumno2 = new Alumno("Harry", "Potter", 2002, 10, 12);
        Alumno alumno3 = new Alumno("Pablo", "Blanco", 2002, 10, 12);
        Alumno alumno4 = new Alumno("Jack", "Blanco", 2002, 10, 12);
        Alumno alumno5 = new Alumno("Olie", "Blanco", 2002, 10, 12);


        alumnoDeque.add(alumno1);
        alumnoDeque.addLast(alumno2);
        alumnoDeque.add(alumno3);
        alumnoDeque.add(alumno4);
        System.out.println(alumnoDeque); // Ana Harry Pablo Jack
        alumnoDeque.addFirst(alumno5);
        System.out.println(alumnoDeque); // Olie Ana Harry Pablo Jack

        System.out.println(alumnoDeque.contains(alumno1)); // true
        System.out.println(alumnoDeque.getFirst()); // Olie
        System.out.println(alumnoDeque);
        System.out.println(alumnoDeque.remove()); // Olie is removed. The first in Deque is removed
        System.out.println(alumnoDeque);

    }
}
