package com.example.daw_programacion.Collections;


import java.util.Stack;

public class Alumno_TestStack {
    public static void main(String[] args) {
        Stack<Alumno> alumnoStack = new Stack<>();
        Alumno alumno1 = new Alumno("Ana", "Blanco", 2002, 10, 12);
        Alumno alumno2 = new Alumno("Harry", "Potter", 2002, 10, 12);
        Alumno alumno3 = new Alumno("Pablo", "Blanco", 2002, 10, 12);
        Alumno alumno4 = new Alumno("Jack", "Blanco", 2002, 10, 12);
        Alumno alumno5 = new Alumno("Olie", "Blanco", 2002, 10, 12);


        alumnoStack.push(alumno1);
        alumnoStack.push(alumno2);
        alumnoStack.push(alumno3);
        alumnoStack.push(alumno4);
        System.out.println(alumnoStack.peek()); // Jack
        System.out.println(alumnoStack); // Ana Harry Pablo Jack
        System.out.println(alumnoStack.pop()); // Jack
        System.out.println(alumnoStack); // Ana Harry Pablo


    }
}
