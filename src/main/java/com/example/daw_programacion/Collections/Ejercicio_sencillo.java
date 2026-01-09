package com.example.daw_programacion.Collections;

import java.util.ArrayList;
import java.util.Collections;
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
        
        ArrayList<Alumno> alumnoArrayList =new ArrayList<>();
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

        //2. ArrayList
        /*
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(4);
        integerArrayList.add(5);
        integerArrayList.add(6);

        agregar(integerArrayList, 10);
        System.out.println(integerArrayList);

        buscar(integerArrayList, 11);
        modificar(integerArrayList, 12, 17);
        System.out.println(integerArrayList);

        eliminar(integerArrayList, 17);
        System.out.println(integerArrayList);

        insertar(integerArrayList, 0, 5);
        System.out.println(integerArrayList);

*/

    }



    public static void agregar(ArrayList<Integer> arrList, Integer num) {
        for (int i = 0; i < arrList.size(); i++) {
            arrList.set(i, arrList.get(i) + num);
        }
    }

    public static void buscar(ArrayList<Integer> arrList, Integer num) {
        if (arrList.contains(num)) {
            System.out.println("The number is on the index: " + arrList.indexOf(num));
        } else {
            System.out.println("Not found");
        }
    }

    public static void modificar(ArrayList<Integer> arrList, Integer before, Integer after) {
        int index = arrList.indexOf(before);
        arrList.set(index, after);
    }

    public static void eliminar(ArrayList<Integer> arrList, Integer num) {
        arrList.remove(num);
    }

    public static void insertar(ArrayList<Integer> arrList, Integer position, Integer num) {
        arrList.set(position, num);
    }

}
