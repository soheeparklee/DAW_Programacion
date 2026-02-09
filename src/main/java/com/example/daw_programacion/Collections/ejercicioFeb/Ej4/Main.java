package com.example.daw_programacion.Collections.ejercicioFeb.Ej4;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Elena", "García Romero", 2005);
        Persona p2 = new Persona("María", "López Torres", 1985);
        Persona p3 = new Persona("Carlos", "Sánchez Molina", 1992);
        Persona p4 = new Persona("Iker", "Martín Pérez", 1988);
        Persona p5= new Persona("Marta", "Ruiz Delgado", 1995);
        Persona p6 = new Persona("Isabella", "Suárez Navarro", 2000);

        //Insercion
        List<Persona> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);

        //Recorrido
        recorrirList(list);

        //Eliminacion
        System.out.println("==========Eliminacion==============");
        Iterator<Persona> iterator = list.iterator();
        while(iterator.hasNext()){
            Persona p = iterator.next();
            if(p.getFirstName().equals("Marta") && p.getLastName().equals("Ruiz Delgado")) iterator.remove();
        }

//        int index = 0;
//        while(iterator.hasNext()){
//            if(index ==4) {
//                iterator.remove();
//                break;
//            }else{
//                index++;
//            }
//        }

        recorrirList(list);

        //Reemplazo
        System.out.println("===========Reemplazo=============");
        Persona sustituir = new Persona("Miguel", "Ramírez Torres", 2003);
        list.remove(2);
        list.add(2, sustituir);

        recorrirList(list);

        //Actualizacion
        System.out.println("===========Actualizacion=============");
        Persona p = list.get(3);
        p.setLastName("Martin Gomez");
        recorrirList(list);

        //Busqueda/Contains
        System.out.println("========Busqueda/Contains================");
        Persona busca = new Persona( "María", "López Torres", 1985);
        if(list.contains(busca)){
            int index = list.indexOf(busca);
            Persona resulto = list.get(index);
            System.out.println(resulto.toString());
        }
        // Ordenacion
        System.out.println("========Ordenacion: age================");
        Collections.sort(list, new AgeComparator());
        recorrirList(list);
        System.out.println("========Ordenacion: nombre================");
        Collections.sort(list, new NombreComparator());
        recorrirList(list);

        //Sublista
        System.out.println("=========Sublista===============");
        List<Persona> sublist = list.subList(2, 4);
        recorrirList(sublist);

        //Conversion a HashSet
        System.out.println("===========Conversion a HashSet=============");
        Persona repetido = new Persona("Elena", "García Romero", 2005);
        list.add(repetido);

        HashSet<Persona> set = new HashSet<>();
        for (Persona persona : list) {
            set.add(persona);
        }

        for (Persona persona : set) {
            System.out.println(persona.toString());
        }

        //Conversion a Array
        System.out.println("==========Conversion a Array==============");
        Persona[] pArray = list.toArray(new Persona[0]);
        //Persona[] pArray = (Persona[]) list.toArray();
        for (Persona persona : pArray) {
            System.out.println(persona.toString());
        }
        //Eliminacion
        System.out.println("==========Eliminacion==============");
        list.clear();
        recorrirList(list);
        //
        System.out.println("========================");
        //
        System.out.println("========================");

    }

    public static void recorrirList(List<Persona> list){
        for (Persona persona : list) {
            System.out.println(persona.toString());
        }
    }
}
