package com.example.daw_programacion.Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Alumno_TestMap {
    public static void main(String[] args) {
        HashMap<Integer, Alumno> alumnoHashMap = new HashMap<>();
        Alumno alumno1 = new Alumno("Ana", "Blanco", 2002, 10, 12);
        Alumno alumno2 = new Alumno("Harry", "Potter", 2002, 10, 12);
        Alumno alumno3 = new Alumno("Pablo", "Blanco", 2002, 10, 12);
        Alumno alumno4 = new Alumno("Jack", "Blanco", 2002, 10, 12);
        Alumno alumno5 = new Alumno("Olie", "Blanco", 2002, 10, 12);

        alumnoHashMap.put(1, alumno1);
        alumnoHashMap.put(2, alumno2);
        alumnoHashMap.put(3, alumno3);
        alumnoHashMap.put(4, alumno4);
        alumnoHashMap.put(5, alumno5);
        System.out.println(alumnoHashMap);

        // get only keys
        Set<Integer> alumnoKeys = alumnoHashMap.keySet();
        System.out.println(alumnoKeys); //[1, 2, 3, 4, 5]

        for (int i = 1; i <= alumnoKeys.size(); i++) {
            System.out.println(alumnoHashMap.get(i));
        }
/*
        Alumno{firstName='Ana', lastName='Blanco', year=2002, month=10, date=12}
        Alumno{firstName='Harry', lastName='Potter', year=2002, month=10, date=12}
        Alumno{firstName='Pablo', lastName='Blanco', year=2002, month=10, date=12}
        Alumno{firstName='Jack', lastName='Blanco', year=2002, month=10, date=12}
        Alumno{firstName='Olie', lastName='Blanco', year=2002, month=10, date=12}
*/


        System.out.println("=====================");
        // get only values
        Collection<Alumno> alumnoCollection = alumnoHashMap.values();
        System.out.println(alumnoCollection);

        // get both key + value
        Set<Map.Entry<Integer, Alumno>> keyValueAlumno = alumnoHashMap.entrySet();
        System.out.println(keyValueAlumno);
        //[1=Alumno{firstName='Ana', lastName='Blanco', year=2002, month=10, date=12}, 2=Alumno{firstName='Harry', lastName='Potter', year=2002, month=10, date=12}, 3=Alumno{firstName='Pablo', lastName='Blanco', year=2002, month=10, date=12}, 4=Alumno{firstName='Jack', lastName='Blanco', year=2002, month=10, date=12}, 5=Alumno{firstName='Olie', lastName='Blanco', year=2002, month=10, date=12}]

        for (Map.Entry<Integer, Alumno> integerAlumnoEntry : keyValueAlumno) {
            System.out.println(integerAlumnoEntry);
        }
/*
        1=Alumno{firstName='Ana', lastName='Blanco', year=2002, month=10, date=12}
        2=Alumno{firstName='Harry', lastName='Potter', year=2002, month=10, date=12}
        3=Alumno{firstName='Pablo', lastName='Blanco', year=2002, month=10, date=12}
        4=Alumno{firstName='Jack', lastName='Blanco', year=2002, month=10, date=12}
        5=Alumno{firstName='Olie', lastName='Blanco', year=2002, month=10, date=12}
*/
        System.out.println("=====================");

        for (Alumno al : alumnoHashMap.values()) {
            System.out.println(al);
        }
        System.out.println("=====================");
/*
        Alumno{firstName='Ana', lastName='Blanco', year=2002, month=10, date=12}
        Alumno{firstName='Harry', lastName='Potter', year=2002, month=10, date=12}
        Alumno{firstName='Pablo', lastName='Blanco', year=2002, month=10, date=12}
        Alumno{firstName='Jack', lastName='Blanco', year=2002, month=10, date=12}
        Alumno{firstName='Olie', lastName='Blanco', year=2002, month=10, date=12}
*/

    }
}
