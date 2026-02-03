package com.example.daw_programacion.OOP.Ejercicio_5.Ej1;

public class DispositivoElectronico {
    private String marca;
    private String modelo;
    private boolean encendido;

    public DispositivoElectronico(String marca, String modelo, boolean encendido) {
        this.marca = marca;
        this.modelo = modelo;
        this.encendido = encendido;
    }

    public void encender(){
        System.out.println("Dispositivo Electronico encendido");
    }
    public void apagar(){
        System.out.println("Dispositivo Electronico apagado");
    }

    public String monstrarInformacion() {
        return "DispositivoElectronico{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", encendido=" + encendido +
                '}';
    }
}
