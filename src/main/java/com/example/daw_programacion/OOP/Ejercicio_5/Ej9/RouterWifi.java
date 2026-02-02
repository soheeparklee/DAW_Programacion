package com.example.daw_programacion.OOP.Ejercicio_5.Ej9;

public class RouterWifi implements Conectable{
    private static int countDispositivos;

    @Override
    public void conectar() {
        countDispositivos++;
        System.out.println("Dispositivo conectado al router. Total conectados: "+  countDispositivos);
    }

    @Override
    public void desconectar() {
        countDispositivos--;
        System.out.println("Wifi router desconectado. Total conectados:" + countDispositivos);
    }
}
