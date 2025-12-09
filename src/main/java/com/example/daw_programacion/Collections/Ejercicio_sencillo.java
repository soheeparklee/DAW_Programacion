package com.example.daw_programacion.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_sencillo {
    public static void main(String[] args) {
        //1. ArrayList
        Alumno alumno1 = new Alumno("Ana", "Blanco", 2002, 10, 12);
        Alumno alumno2 = new Alumno("Mina", "Rojo", 1899, 11, 02);
        Alumno alumno3 = new Alumno("Pablo", "Boy", 2002, 10, 12);
        Alumno alumno4 = new Alumno("Jack", "Blabla", 2002, 10, 12);
        Alumno alumno5 = new Alumno("Olie", "Car", 2002, 10, 12);

        Scanner sc = new Scanner(System.in);
        /*
        do{
            System.out.println();
            
        }while(input != "false");
       
         */
        
        ArrayList<Alumno> alumnoArrayList =new ArrayList();
        alumnoArrayList.add(alumno1);
        alumnoArrayList.add(alumno2);
        alumnoArrayList.add(alumno3);
        alumnoArrayList.add(alumno4);
        alumnoArrayList.add(alumno5);

        Iterator<Alumno> iterator = alumnoArrayList.iterator();
        while(iterator.hasNext()){
            Alumno alumno = iterator.next();
            System.out.println(alumno.getFirstName());
            if(alumno.getLastName().charAt(0) > 'P'){
                //alumnoArrayList.remove(alumno); // ❌ this code will fail
                iterator.remove();
            }
        }

        System.out.println(alumnoArrayList);

        /*
        for (Alumno alumno : alumnoArrayList) {
            System.out.println(alumno.getFirstName());
            if(alumno.getLastName().charAt(0) > 'P'){
                alumnoArrayList.remove(alumno);
            }
        }

        System.out.println(alumnoArrayList);
        */
    }
}
