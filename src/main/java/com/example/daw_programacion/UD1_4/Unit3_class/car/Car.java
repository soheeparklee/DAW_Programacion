package com.example.daw_programacion.UD1_4.Unit3_class.car;

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

    public Car(){}

    public Car(String color, int velocidad, double carburante){
        this.color = color;
        this.velocidad = velocidad;
        this.carburante = carburante;
    }

    public Car(Car car){ //copy constructor
        this.color = car.getColor();
        this.velocidad = car.getVelocidad();
        this.carburante = car.getCarburante();
    }

    //These 3 constructors are example of sobrecarga de métodos
    //method overloading

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
