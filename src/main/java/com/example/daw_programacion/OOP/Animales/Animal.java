package com.example.daw_programacion.OOP.Animales;

public abstract class Animal {
    private int patas;
    private String nombre;

    public Animal(String nombre, int patas) {
        this.nombre = nombre;
        this.patas = patas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public void hacerSonido(){
        System.out.println("Sonido generico");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", patas=" + patas +
                '}';
    }
}
