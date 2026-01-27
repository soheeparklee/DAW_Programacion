package com.example.daw_programacion.OOP.Ejercicio_4.Ej2;

public class Coche extends Vehiculo{

    private int puertas;

    public Coche(String marca, int puertas) {
        super(marca);
        this.puertas = puertas;
    }

    public boolean abrirMaletero(){
        return true;
    }

    @Override
    public String monstarInfo() {
        return "Coche{" +
                "puertas=" + puertas +
                '}';
    }

}
