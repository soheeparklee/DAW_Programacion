package com.example.daw_programacion.OOP.Animales;

public class Gato extends Animal{

    public Gato(String nombre, int patas) {
        super(nombre, patas);
    }

    @Override
    public void hacerSonido(){
        System.out.println("meow");
    }
}
