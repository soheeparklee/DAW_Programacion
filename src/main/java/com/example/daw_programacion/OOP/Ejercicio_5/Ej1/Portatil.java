package com.example.daw_programacion.OOP.Ejercicio_5.Ej1;

public class Portatil extends DispositivoElectronico{

    private int  tamañoPantalla;

    public Portatil(String marca, String modelo, boolean encendido, int tamañoPantalla) {
        super(marca, modelo, encendido);
        this.tamañoPantalla = tamañoPantalla;
    }
}
