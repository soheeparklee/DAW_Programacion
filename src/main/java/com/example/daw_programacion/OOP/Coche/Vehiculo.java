package com.example.daw_programacion.OOP.Coche;

// Clase abstracta (no se puede instanciar)
public abstract class Vehiculo {
    private String matricula;
    private int numRuedas;

    public Vehiculo(String matricula, int numRuedas) {
        this.matricula = matricula;
        this.numRuedas = numRuedas;
    }

    abstract void acelerar();
    abstract void frenar();
    // Método concreto (implementado)
    public void encender() {
        System.out.println("Vehículo encendido");
    }
// Subclases concretas (deben implementar métodos abstractos)
}

