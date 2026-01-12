package com.example.daw_programacion.OOP;

public class HerenciaMain {
    public static void main(String[] args) {
        Coche coche1 = new Coche(4, "3231", true, 400);

        System.out.println(coche1);
        //if toString() is not overrided, will use the parent toString()
        //this will only print vehiculo attributes, as Coche class did not override toString
        //Vehiculo{electrico=true, matriculo='3231', numRuedas=4}
    }
}
