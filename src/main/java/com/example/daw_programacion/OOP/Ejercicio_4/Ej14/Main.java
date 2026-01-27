package com.example.daw_programacion.OOP.Ejercicio_4.Ej14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> GensionAcademica = new ArrayList<>();


    }

    //sobre carga
    public static void inscribir(Estudiante estudiante, Asignatura asignatura){
        List<Asignatura> list = estudiante.getAsignaturas();
        list.add(asignatura);
    }

    public static void inscribir(Estudiante estudiante, Asignatura asignatura, Horario horario){
        List<Horario> list = estudiante.getHorarios();
        list.add(horario);
    }
}
