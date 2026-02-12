package com.example.daw_programacion.ExamenTest.modulo;

import com.example.daw_programacion.ExamenTest.excepciones.SaldoNegativo;

import java.util.Objects;

public abstract class Cuenta implements Comparable<Cuenta>{
    private String DNI;
    private int numeroDeCuenta;
    private double saldo;

    public Cuenta(String DNI, int numeroDeCuenta, double saldo) {
        this.DNI = DNI;
        this.numeroDeCuenta = numeroDeCuenta;
        if(checkSaldoNotNegative(saldo)){
            this.saldo = saldo;
        }else{
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }


    // access modifier: protected
    protected void setSaldo(double saldo) {
        if(checkSaldoNotNegative(saldo)){
            this.saldo = saldo;
        }else{
            this.saldo = 0;
        }
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void ingresarDinero(double ingresarAmount){
        saldo += ingresarAmount;
        System.out.println("Saldo ingresado: " + saldo);
    }
    public abstract void retriarDinero(double retirarAmount) throws SaldoNegativo;

    //Poner un saldo en cada una de ellas controlando que cuando introduzcas el
    //saldo este no sea negativo. Insertar las cuentas en el banco.
    public boolean checkSaldoNotNegative(double saldoInput){
        if(saldoInput > 0) return true;
        else return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cuenta cuenta)) return false;
        return numeroDeCuenta == cuenta.numeroDeCuenta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDeCuenta);
    }

    @Override
    public String toString() {
        return "DNI= " + DNI + " numeroDeCuenta= " + numeroDeCuenta + " saldo= " + saldo;
    }



    @Override
    public int compareTo(Cuenta otro) {
        return Double.compare(otro.getSaldo(), this.saldo);
    }


}
