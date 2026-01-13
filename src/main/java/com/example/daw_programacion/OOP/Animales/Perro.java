package com.example.daw_programacion.OOP.Animales;

public class Perro extends Animal{
    private String tipo;


    public Perro(String nombre, int patas) {
        super(nombre, patas);
    }

    public Perro(String nombre, int patas, String tipo) {
        super(nombre, patas);
        this.tipo = tipo;
    }
/*
    // hacerSonido() does not exist
    // then execute the parent(Animal) class hacerSonido()
    // will print "Sonido generico"
    @Override
    public void hacerSonido(){
        System.out.println("woof woof");
    }
*/

}
