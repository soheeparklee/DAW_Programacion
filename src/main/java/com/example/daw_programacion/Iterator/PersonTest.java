package com.example.daw_programacion.Iterator;

import java.util.Arrays;

public class PersonTest {
    public static void main(String[] args) {
        //ArrayList<Person> personArrList = new ArrayList<>();

        Person p1 = new Person("Jack", 10);
        Person p2 = new Person("Marc", 15);
        Person p3 = new Person("Sally", 20);
        Person p4 = new Person("Zoe", 25);


        /*personArrList.add(p1);
        personArrList.add(p2);
        personArrList.add(p3);
        personArrList.add(p4);
*/
        Person[] personArr = {p1, p2, p3, p4};

        System.out.println(Arrays.binarySearch(personArr, p3));
        //Collections.sort(personArrList); // Usa Comparable automáticamente
    }
}
