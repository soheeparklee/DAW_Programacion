package com.example.daw_programacion.OOP.Ejercicio_4.Ej13;

import java.sql.SQLOutput;

public class Robot implements Movil{
    private String name;

    @Override
    public void mover() {
        System.out.println("mover robot");
    }

    @Override
    public void detener() {
        System.out.println("detener robot");
    }
}
