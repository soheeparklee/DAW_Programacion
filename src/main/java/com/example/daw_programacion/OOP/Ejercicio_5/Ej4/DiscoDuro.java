package com.example.daw_programacion.OOP.Ejercicio_5.Ej4;

public class DiscoDuro extends DispositivoAlmacenamiento{
    @Override
    void guardarDatos(String datos){
        System.out.println("Gurardar datos en Discoduro: " + datos);
    }
}
