package com.example.daw_programacion.OOP.Ejercicio_5.Ej3;

public class Motocicleta extends Vehiculo{
    private String tipoCascoRecomendado;

    public Motocicleta(String marca, String modelo, int velocidadMaxima, String tipoCascoRecomendado) {
        super(marca, modelo, velocidadMaxima);
        this.tipoCascoRecomendado = tipoCascoRecomendado;
    }

    @Override
    public void acelerar(int velodicad){
        super.acelerar(velodicad);
        System.out.println("Velocidad de moto acelerado");
    }

    public boolean usarCasco(){
        return true;
    }
}
