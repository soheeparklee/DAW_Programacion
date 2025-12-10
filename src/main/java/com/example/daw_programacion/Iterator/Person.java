package com.example.daw_programacion.Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Person implements Comparable<Person>{
    private String nombre;
    private int age;
    public Person(String nombre, int age) {
        this.nombre = nombre;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person otro) {
        return age > otro.getAge() ? 1 : (age == otro.getAge()) ? 0 : -1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nombre='" + nombre + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jack", 10);
        Person p2 = new Person("Marc", 15);
        Person p3 = new Person("Sally", 20);
        Person p4 = new Person("Zoe", 25);

        Person[] personArr = {p1, p2, p3, p4};

        System.out.println(Arrays.binarySearch(personArr, p3));

        ArrayList<Person> personArrList = new ArrayList<>();
        personArrList.add(p1);
        personArrList.add(p3);
        personArrList.add(p4);
        personArrList.add(p2); //순서: jack - sally - zoe - marc

        Collections.sort(personArrList); // jack - marc - sally - zoe 나이 어린 순에서 높은 순으로
        System.out.println(personArrList);
    }

}
