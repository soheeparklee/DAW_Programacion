package com.example.daw_programacion.UD1_4.Unit3_class_ejercicio_2;

import java.util.Scanner;

public class E1_Tienda {
    String nombre;
    String dirreción;
    int cantidadDeJuegosDisponibles;

    public E1_Tienda(String nombre, String dirreción, int cantidadDeJuegosDisponibles) {
        this.nombre = nombre;
        this.dirreción = dirreción;
        this.cantidadDeJuegosDisponibles = cantidadDeJuegosDisponibles;
    }

    public E1_Tienda(String nombre, String dirreción){
        this(nombre, dirreción, 100);
    }

    //method vender juego
    public void agregarStock(int cantidad){
        this.cantidadDeJuegosDisponibles += cantidad;
    }

    public void monstrarInventario(){
        System.out.println(" nombre: " + nombre + " dirreción: " + dirreción + " cantidadDeJuegosDisponibles: " + cantidadDeJuegosDisponibles);
    }
}
