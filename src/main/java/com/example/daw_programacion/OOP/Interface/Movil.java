package com.example.daw_programacion.OOP.Interface;

// Una clase puede implementar varias interfaces y
// hereda de forma implícita de la clase Object
public class Movil implements DispositivoInteligente {
    @Override
    public void encender() {
        System.out.println("Móvil encendido"); }
    @Override
    public void recargar() {
        System.out.println("Móvil recargando batería"); }
    @Override
    public void conectarWifi() {
        System.out.println("Móvil conectado al WiFi"); }
    }