package com.example.daw_programacion.ExamenTest;

public abstract class Cuenta {
    private String DNI;
    private static int numeroDeCuenta = 0;
    private double saldo;

    public Cuenta(String DNI, double saldo) {
        this.DNI = DNI;
        numeroDeCuenta++;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    void ingresarDinero(int ingresarAmount){
        saldo += ingresarAmount;
    }
    abstract boolean retriarDinero(int retirarAmount);


}
