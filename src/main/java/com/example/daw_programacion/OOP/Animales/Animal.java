package com.example.daw_programacion.OOP.Animales;

import java.util.Objects;

public abstract class Animal {
    private int patas;
    private String nombre;

    public Animal(String nombre, int patas) {
        this.patas = patas;
        this.nombre = nombre;
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

    public abstract void hacerSonido();

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", patas=" + patas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return patas == animal.patas && Objects.equals(nombre, animal.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patas, nombre);
    }
}
