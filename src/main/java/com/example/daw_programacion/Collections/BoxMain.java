package com.example.daw_programacion.Collections;

public class BoxMain {
    Box<String, Integer> stringBox = new Box<>("Hola", 123);
    Box<Integer, Alumno> integerBox = new Box<>(123, new Alumno("Ana", "Garcia", 2020, 12, 3));

}
