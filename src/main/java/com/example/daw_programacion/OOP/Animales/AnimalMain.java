package com.example.daw_programacion.OOP.Animales;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("animal", 10);
        System.out.println(animal);

        Perro perro = new Perro("pepe", 4, "type1");
        System.out.println(perro);

        Gato gato = new Gato("Gaga", 4, "orange");

    }
}
