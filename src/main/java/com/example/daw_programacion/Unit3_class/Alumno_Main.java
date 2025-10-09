package com.example.daw_programacion.Unit3_class;

public class Alumno_Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("John", "Doe", Turno.MAÑANA);
        String nombre = alumno.getNombre();
        System.out.println(nombre);
    }
}
