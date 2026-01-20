package com.example.daw_programacion.OOP.Interface;

public class DispositivoMain {
    public static void main(String[] args) {
        DispositivoInteligente d = new Movil();
        d.encender();
        d.recargar();
        d.conectarWifi(); }
}
