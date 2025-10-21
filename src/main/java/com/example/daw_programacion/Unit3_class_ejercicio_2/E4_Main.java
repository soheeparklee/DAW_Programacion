package com.example.daw_programacion.Unit3_class_ejercicio_2;

public class E4_Main {
    public static void main(String[] args) {
        E4_Ordenador o1 = new E4_Ordenador("one", "DAW");
        System.out.println(o1.getType());
        E4_Ordenador o2 = new E4_Ordenador("one", "WAD");
        System.out.println(o1.getType());
    }
}
