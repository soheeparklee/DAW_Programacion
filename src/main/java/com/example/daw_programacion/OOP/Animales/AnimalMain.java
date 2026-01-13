package com.example.daw_programacion.OOP.Animales;

public class AnimalMain {
    public static void main(String[] args) {


        Perro perro = new Perro("pepe", 4, "type1");
        System.out.println(perro);
        //case 1: perro and animal() both have toString() overrided
        // Perro{tipo='type1'} Animal{nombre='pepe', patas=4}

        //case2: only Animal has toString(), perro did not override
        // Animal{nombre='pepe', patas=4}

        Gato gato = new Gato("Gaga", 4, "orange");

    }
}
