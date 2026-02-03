package com.example.daw_programacion.OOP.Ejercicio_5.Ej5;

public class Rectangulo extends FiguraGeometrica{
    private double width;
    private double height;

    @Override
    double calcularArea() {
        return width * height;
    }
}
