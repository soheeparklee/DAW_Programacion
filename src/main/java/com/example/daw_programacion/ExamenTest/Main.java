package com.example.daw_programacion.ExamenTest;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //CuentaCorriente con 500 euros asociada a una Cuenta de Ahorro asociada de 300
        CuentaDeAhorro cuentaDeAhorro1 = new CuentaDeAhorro("A73950584", 300, 2019);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("A73950584",  500, cuentaDeAhorro1);

        // dos cuentas de Ahorro especial con una penalización del 5% y el 3%
        CuentaDeAhorroEsp ahorroEsp1 = new CuentaDeAhorroEsp("C34857395",  100, 2025, 5);
        CuentaDeAhorroEsp ahorroEsp2 = new CuentaDeAhorroEsp("D34895739", 200, 2018, 3);

        //Banco con 10 cuentas
        CuentaDeAhorro cuentaDeAhorro2 = new CuentaDeAhorro("J9357893D", 200, 2015);
        CuentaDeAhorro cuentaDeAhorro3 = new CuentaDeAhorro("U48539759", 100, 2020);
        CuentaDeAhorro cuentaDeAhorro4 = new CuentaDeAhorro("45838979W", 900, 2021);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente("M48573985",  1500, cuentaDeAhorro2);
        CuentaCorriente cuentaCorriente3 = new CuentaCorriente("B47534853",  800, cuentaDeAhorro3);
        CuentaCorriente cuentaCorriente4 = new CuentaCorriente("A98475389",  400, cuentaDeAhorro4);

        ArrayList<Cuenta> banco = new ArrayList<>();
        banco.add(cuentaDeAhorro1);
        banco.add(cuentaCorriente1);
        banco.add(ahorroEsp1);
        banco.add(ahorroEsp2);
        banco.add(cuentaDeAhorro2);
        banco.add(cuentaDeAhorro3);
        banco.add(cuentaDeAhorro4);
        banco.add(cuentaCorriente2);
        banco.add(cuentaCorriente3);
        banco.add(cuentaCorriente4);







    }
}
