package com.example.daw_programacion.ExamenTest.modulo;

import java.util.HashSet;

public class Banco {
    private HashSet<Cuenta> cuentaSet;

    public Banco() {
        cuentaSet = new HashSet<>();
    }

    public HashSet<Cuenta> getCuentaSet() {
        return cuentaSet;
    }

    public void addCuenta(Cuenta cuenta){
        this.cuentaSet.add(cuenta);
    }

    public double totalSaldo(){
        double saldoTotal = 0;
        for (Cuenta cuenta : this.cuentaSet) {
            if(cuenta instanceof CuentaCorriente){
                saldoTotal += cuenta.getSaldo();
            }
        }
        return saldoTotal;
    }

    public CuentaDeAhorroEsp maxPenalización(){
        int maxPen = 0;
        CuentaDeAhorroEsp cuentaEsp = new CuentaDeAhorroEsp("", 0, 0, 0, 0);
        for (Cuenta cuenta : this.cuentaSet) {
            if(cuenta instanceof CuentaDeAhorroEsp){
                if(((CuentaDeAhorroEsp) cuenta).getPenalizacion() > maxPen){
                    maxPen = ((CuentaDeAhorroEsp) cuenta).getPenalizacion();
                    cuentaEsp = (CuentaDeAhorroEsp) cuenta;
                }
            }
        }
        return cuentaEsp;
    }
}
