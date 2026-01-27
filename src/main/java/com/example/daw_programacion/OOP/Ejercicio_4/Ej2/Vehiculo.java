package com.example.daw_programacion.OOP.Ejercicio_4.Ej2;

public class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String monstarInfo(){
        return  "Vehiculo{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
