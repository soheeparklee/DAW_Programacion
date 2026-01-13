package com.example.daw_programacion.OOP.Animales;

public class Gato extends Animal{
    private String color;

    public Gato(String nombre, int patas) {
        super(nombre, patas);
    }

    public Gato(String nombre, int patas, String color) {
        super(nombre, patas);
        this.color = color;
    }

    @Override
    public void hacerSonido(){
        System.out.println("meow");
    }
}
