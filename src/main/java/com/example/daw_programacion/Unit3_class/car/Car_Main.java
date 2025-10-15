package com.example.daw_programacion.Unit3_class.car;

public class Car_Main {
    public static void main(String[] args) {
        Car car = new Car();
        //when color is private, we cannot access from outside class
        //car.color = "red";


        //we have setters now!
        car.setColor("pink");
        System.out.println(car.getColor());
    }
}
