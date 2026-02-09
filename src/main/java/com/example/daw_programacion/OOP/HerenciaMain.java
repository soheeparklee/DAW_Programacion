package com.example.daw_programacion.OOP;

import java.util.ArrayList;

public class HerenciaMain {
    public static void main(String[] args) {
        Coche1 coche1 = new Coche1(4, "3231", true, 400);

        System.out.println(coche1);

        ArrayList<String> stringList1 = new ArrayList<>();
        ArrayList<String> stringList2 = new ArrayList<>();
        ArrayList<String> stringList3 = new ArrayList<>();
        ArrayList<String> stringList4 = new ArrayList<>();
        ArrayList<String> stringList5 = new ArrayList<>();
        ArrayList<String> stringList6 = new ArrayList<>();
        //if toString() is not overrided, will use the parent toString()
        //this will only print vehiculo attributes, as Coche class did not override toString
        //Vehiculo{electrico=true, matriculo='3231', numRuedas=4}
    }
}
