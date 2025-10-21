package com.example.daw_programacion.Unit3_class_ejercicio_2;

public class E1_Jugador {
    String nombre;
    int edad;
    int nivelDeExperiencia;
    int horasJugadas;

    public E1_Jugador(String nombre, int edad, int nivelDeExperiencia, int horasJugadas) {
        this.nombre = nombre;
        this.edad = edad;
        this.nivelDeExperiencia = nivelDeExperiencia;
        this.horasJugadas = horasJugadas;
    }

    public E1_Jugador(String nombre, int edad) {
        this(nombre, edad, 1, 0);
    }

    //method jugar

    public void subirExperiencia(int nivel){
        this.nivelDeExperiencia += nivel;
    }
    public void resetearProgreso(){
        this.nivelDeExperiencia = 1;
    }



}
