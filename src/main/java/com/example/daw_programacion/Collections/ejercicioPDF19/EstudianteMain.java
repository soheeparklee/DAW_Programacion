package com.example.daw_programacion.Collections.ejercicioPDF19;

import java.util.*;

public class EstudianteMain {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("S1", "Juan");
        Estudiante e2 = new Estudiante("S2", "Maria");
        Estudiante e3 = new Estudiante("S3", "Pedro");
        Estudiante e4 = new Estudiante("S4", "Laura");

        //1. ALmacenamiento de la lista de espera
        //fifo -> stack
        Stack<Estudiante> stack = new Stack<>();
        stack.push(e1);
        stack.push(e2);
        stack.push(e3);
        stack.push(e4);

        //2. Registro de estudiantes matriculados
        HashMap<String, String> registroMatriculado = new HashMap<>();

        //(1) Procesar la lista de espera:
        Iterator iterator = stack.iterator();
        while(iterator.hasNext()){
            Estudiante e = (Estudiante) iterator.next();
            if(!registroMatriculado.containsKey(e.getID())){
                registroMatriculado.put(e.getID(), e.getNombre());
            }
        }

        //(2) Mostrar estudiantes matriculados:
        System.out.println("-- Estudiantes Matriculados ---");
        Set<Map.Entry<String, String>> entries = registroMatriculado.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Estudiante {ID=" + entry.getKey() + ", Nombre="+entry.getValue()+"}");
        }

        //3. Asignación de cursos a estudiantes:
        Asignatura fisica = new Asignatura("fisica");
        Asignatura quimica = new Asignatura("quimica");
        Asignatura matematicas = new Asignatura("matematicas");
        Asignatura biologia = new Asignatura("biologia");

        List<Asignatura> listaE1 = List.of(fisica, quimica, biologia, matematicas);
        List<Asignatura> listaE2 = List.of(fisica, quimica, biologia, matematicas);
        List<Asignatura> listaE3 = List.of(fisica, quimica, matematicas);
        List<Asignatura> listaE4 = List.of(fisica, matematicas);

        HashMap<String, List<Asignatura>> asignacion = new HashMap<>();
        asignacion.put(e1.getID(), listaE1);
        asignacion.put(e2.getID(), listaE2);
        asignacion.put(e3.getID(), listaE3);
        asignacion.put(e4.getID(), listaE4);

        //4. Listado de asignaturas disponibles
        HashMap<String, String> mapAsignatura = new HashMap<>();
        mapAsignatura.put(fisica.getAsignaturaNombre(), "");
        mapAsignatura.put(quimica.getAsignaturaNombre(), "");
        mapAsignatura.put(matematicas.getAsignaturaNombre(), "");
        mapAsignatura.put(biologia.getAsignaturaNombre(), "");




        //(3) Mostrar asignación de asignaturas:
        System.out.println("--- Asignación de asignaturas (ID → Asignaturas) ---");
        //pero map no implementa iterator
        Set<Map.Entry<String, List<Asignatura>>> asignacionEntries = asignacion.entrySet();
        for (Map.Entry<String, List<Asignatura>> asignacionEntry : asignacionEntries) {
            System.out.println(asignacionEntry.getKey() + " -> " + printAsignatura(asignacionEntry.getValue()));
        }
        //si no era map, usamos iterator

        //(4) Mostrar cursos únicos:
        System.out.println("--- Asignaturas Ofrecidas ---");
        for (String nombre: mapAsignatura.keySet()) {
            System.out.println(nombre);
        }



    }
    public static String printAsignatura(List<Asignatura> lista){
        String result = "[";
        for (Asignatura asignatura : lista) {
            result += asignatura.getAsignaturaNombre() + " ";
        }
        return result+"]";
    }
}
