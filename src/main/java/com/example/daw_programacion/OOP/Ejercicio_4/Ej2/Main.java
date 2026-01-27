package com.example.daw_programacion.OOP.Ejercicio_4.Ej2;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("Kia", 4);
        Moto moto = new Moto("Nissan", false);
        Camion camion = new Camion("Benz", 32);
        Vehiculo v1 = new Vehiculo("Hyundai");


        //overriding
        System.out.println(v1.monstarInfo());
        System.out.println(coche.monstarInfo());

        //upcasting
        Vehiculo v2 = coche;
        System.out.println(v2.monstarInfo());

        //downcasting
        Vehiculo v3 = new Moto("ABC", true);
        Moto motoVehiculo = (Moto) v3;
        motoVehiculo.hacerCaballito();
        motoVehiculo.monstarInfo();

        //downcasting incorrecto
        Vehiculo v4 = new Moto("Kia", false);
        Coche c1 = (Coche) v4;
        c1.abrirMaletero();
        // Class cast exception
        //Moto cannot be cast to class Coche



    }
}
