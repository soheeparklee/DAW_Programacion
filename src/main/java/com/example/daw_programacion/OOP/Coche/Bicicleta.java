package com.example.daw_programacion.OOP.Coche;

public class Bicicleta extends Vehiculo {

    public Bicicleta(String matricula, int numRuedas) {
        super(matricula, numRuedas);
    }

    @Override
    void acelerar() {
        System.out.println("Bicicleta acelerando pedaleando"); }
    @Override
    void frenar() {
        System.out.println("Bicicleta frenando con zapatas"); }

    @Override
    public void encender(){
        System.out.println("Bicicleta");
    }
}