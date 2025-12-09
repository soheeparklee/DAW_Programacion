package com.example.daw_programacion.UD1_4.Unit3_class_ejercicio_2;

public class E1_Consola {
    String nombre;
    String marca;
    int añoDeLanzamiento;
    int capacidadDeAlmacenamiento;

    public E1_Consola(String nombre, String marca, int añoDeLanzamiento, int capacidadDeAlmacenamiento){
        this.nombre = nombre;
        this.marca = marca;
        this.añoDeLanzamiento = añoDeLanzamiento;
        this.capacidadDeAlmacenamiento = capacidadDeAlmacenamiento;
    }
    public E1_Consola(String nombre, String marca){
        this.nombre = nombre;
        this.marca = marca;
        this.añoDeLanzamiento = 2025;
        this.capacidadDeAlmacenamiento = 500;
    }

    public void monstarDetalles(){
        System.out.println(" nombre: " + nombre + " marca: " + marca + " añoDeLanzamiento: " + añoDeLanzamiento + " capacidadDeAlmacenamiento: " + capacidadDeAlmacenamiento);
    }
    public void actualizarFirmware(int capacidad){
        this.capacidadDeAlmacenamiento += capacidad;
    }
/*
    public void reinciar(){
        //what do we do??
    }
*/


}
