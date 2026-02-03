package com.example.daw_programacion.OOP.Ejercicio_5.Ej4;

public class USB extends DispositivoAlmacenamiento{
    @Override
    void guardarDatos(String datos){
        System.out.println("Gurardar datos en USB: " + datos);
    }
}
