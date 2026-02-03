package com.example.daw_programacion.OOP.Ejercicio_5.Ej5;

public class Circulo extends FiguraGeometrica{
    private double radius;
    private final double PI = 3.14;

    @Override
    double calcularArea() {
        return radius*radius*PI;
    }
}
