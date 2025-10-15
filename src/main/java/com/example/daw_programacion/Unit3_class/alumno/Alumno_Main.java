package com.example.daw_programacion.Unit3_class.alumno;

public class Alumno_Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("John", "Doe", Turno.MAÑANA);
        String nombre = alumno.getNombre();
        Turno turno = Turno.TARDE;
        alumno.setTurno(turno);

        System.out.println(nombre);
        System.out.println(alumno.turno);
    }
}
