package com.example.daw_programacion.Collections.ejercicio;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Ejercicio_sensillo_Persona {
    public static void main(String[] args) {
        //3. Persona
        ArrayList<Persona> personaArrayList = new ArrayList<>();
        Persona p1 = new Persona("1", "Park", "Park", "male", 12, 40.0);
        Persona p2 = new Persona("2", "Dark", "Dark", "male", 12, 40.0);
        Persona p3 = new Persona("3", "Cark", "Cark", "male", 12, 40.0);
        Persona p4 = new Persona("4", "Sark", "Sark", "male", 12, 40.0);
        Persona p5 = new Persona("5", "Aark", "Aark", "male", 12, 40.0);

        personaArrayList.add(p1);
        personaArrayList.add(p2);
        personaArrayList.add(p3);
        personaArrayList.add(p4);
        personaArrayList.add(p5);

        //1. buscar dado el dni
        boolean esta = personaArrayList.contains(new Persona("1"));
        System.out.println("esta: "+ esta);

        Persona foundPerson = buscarPersona(personaArrayList, "1");
        if(foundPerson != null){
            System.out.println(foundPerson.toString());
        }
        //2. eliminar una persona
        eliminarPersona(personaArrayList, "2");
        System.out.println( "personaArrayList" +  personaArrayList);

        //3. ordenar por apellidos
        //Collections.sort(personaArrayList); //Aark - Cark - Dark - Park - Sark
        System.out.println( "ㅣㅕㅣㅕㅣㅕㅣㅕ" +  personaArrayList);

        //4. monstrar todas las personas
        System.out.println( "personaArrayList" +  personaArrayList);

    }

    public static Persona buscarPersona(ArrayList<Persona> personaArrayList, String dni) {
        for (Persona persona : personaArrayList) {
            if (persona.getDni().equals(dni)) {
                return persona;
            }
        }
        return null;
    }

    public static boolean eliminarPersona(ArrayList<Persona> personaArrayList, String dni){
        Iterator<Persona> iterator = personaArrayList.iterator();
        while(iterator.hasNext()){
            Persona next = iterator.next();
            if(next.getDni().equals(dni)){
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
