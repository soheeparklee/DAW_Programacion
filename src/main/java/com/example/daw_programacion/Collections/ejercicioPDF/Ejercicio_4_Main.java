package com.example.daw_programacion.Collections.ejercicioPDF;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Ejercicio_4_Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Elena", "García Romero", 2005);
        Persona p2 = new Persona("María", "López Torres", 1985);
        Persona p3 = new Persona("Carlos", "Sánchez Molina", 1992);
        Persona p4 = new Persona("Iker", "Martín Pérez", 1988);
        Persona p5 = new Persona("Marta", "Ruiz Delgado", 1995);
        Persona p6 = new Persona("Isabella", "Suárez Navarro", 2000);

        //Insertion
        LinkedList<Persona> linkedList = new LinkedList<>();
        linkedList.add(p1);
        linkedList.add(p2);
        linkedList.add(p3);
        linkedList.add(p4);
        linkedList.add(p5);
        linkedList.add(p6);

        //Traversal for-each
//        for (Persona persona : linkedList) {
//            System.out.println(persona.toString());
//        }

        //Eliminacion
//        Iterator iterator = linkedList.iterator();
//        while(iterator.hasNext()){
//            Persona p = iterator.next();
//            if(p.getNombre().equals("Marta") && p.getApellido().equals("Ruiz Delgado")){
//                iterator.remove();
//            }
//        }

        //Reemplazo

        //Actualización

        //Ordenación
        Collections.sort(linkedList, new PersonaYearComparator());

        for (Persona persona : linkedList) {
            System.out.println(persona.toString());
        }

        System.out.println("");
        System.out.println("");


        Collections.sort(linkedList, new PersonaNameComparator());

        for (Persona persona : linkedList) {
            System.out.println(persona.toString());
        }

    }
}
