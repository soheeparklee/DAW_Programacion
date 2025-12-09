package com.example.daw_programacion.UD1_4.Unit3_class_ejercicio_2;

public class E1_Personaje {
    String nombre;
    int nivel;
    int puntosDeVida;
    int fuerza;

    public E1_Personaje(String nombre, int nivel, int puntosDeVida, int fuerza){
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.fuerza = fuerza;
    }
    public E1_Personaje(String nombre, int nivel){
        this.nombre= nombre;
        this.nivel = nivel;
        this.puntosDeVida = 100;
        this.fuerza = 10;
    }

    public void subirNivel(){
        this.nivel = this.nivel +1;
    }
    public void recibirDaño(int cantidad){
        this.puntosDeVida = this.puntosDeVida - cantidad;
    }
    public void curarse(int puntos){
        this.puntosDeVida = this.puntosDeVida + puntos;
    }
}
