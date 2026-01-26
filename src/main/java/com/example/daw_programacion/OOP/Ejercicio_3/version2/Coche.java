package com.example.daw_programacion.OOP.Ejercicio_3.version2;

public class Coche {
    private String modelo;
    private int kilometraje;

    public Coche(String modelo, int kilometraje) {
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", kilometraje=" + kilometraje +
                '}';
    }
}
