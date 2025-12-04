package com.example.daw_programacion.UD1_4.Unit3_class.car;

public class Car_Main {
    public static void main(String[] args) {
        Car car = new Car();
        //when color is private, we cannot access from outside class
        //car.color = "red"; // impossible when car attribute is private
        car.setColor("pink");
        System.out.println(car.getColor());

        Car car1 = new Car("Blue", 10, 5.0);
        Car car2 = car1; //car 1 and 2 reference the same memory address
        car1.setColor("Red");
        System.out.println(car2.getColor()); //Red

        Car car3 = new Car("Blue", 10, 5.0);
        Car car4 = new Car(car3); //use copy constructor, car 3 and car 4 reference different objects
        car3.setColor("Red");
        System.out.println(car4.getColor()); //Blue
    }
}
