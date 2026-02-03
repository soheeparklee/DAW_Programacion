package com.example.daw_programacion.OOP.Ejercicio_5.Ej3;

public class Coche extends Vehiculo{
    private int numeroPuertas;

    public Coche(String marca, String modelo, int velocidadMaxima, int numeroPuertas) {
        super(marca, modelo, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void acelerar(int velodicad){
        super.acelerar(velodicad);
        System.out.println("Velocidad de coche acelerado");
    }
}
