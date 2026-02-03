package com.example.daw_programacion.OOP.Ejercicio_5.Ej1;

public class TelefonoMovil extends DispositivoElectronico{
    private String sistemaOperativo;

    public TelefonoMovil(String marca, String modelo, boolean encendido, String sistemaOperativo) {
        super(marca, modelo, encendido);
        this.sistemaOperativo = sistemaOperativo;
    }
}
