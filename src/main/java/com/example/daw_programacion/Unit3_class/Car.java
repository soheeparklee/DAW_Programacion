package com.example.daw_programacion.Unit3_class;

public class Car {
    //bad to make public!
/*
    public String color;
    public int velocidad;
    public double carburante; //fuel
*/

    //use
    private String color;
    private int velocidad;
    private double carburante; //fuel

    public String getColor(){
        return color;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public double getCarburante(){
        return carburante;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setCarburante(double carburante) {
        this.carburante = carburante;
    }
}
