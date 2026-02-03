package com.example.daw_programacion.OOP.Ejercicio_5.Ej3;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void acelerar(int velodicad){
        this.velocidadMaxima += velodicad;
    }
}
