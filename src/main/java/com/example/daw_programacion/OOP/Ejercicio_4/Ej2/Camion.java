package com.example.daw_programacion.OOP.Ejercicio_4.Ej2;

public class Camion extends Vehiculo{
    private int cargaMninima;

    public Camion(String marca, int cargaMninima) {
        super(marca);
        this.cargaMninima = cargaMninima;
    }
    public void cargarMecanica(){
        System.out.println("Initializando carga mecanica...");
    }

    @Override
    public String monstarInfo() {
        return "Camion{" +
                "cargaMninima=" + cargaMninima +
                '}';
    }
}
