package com.example.daw_programacion.ExamenTest.modulo;

import com.example.daw_programacion.ExamenTest.excepciones.SaldoNegativo;

public class CuentaDeAhorroEsp extends CuentaDeAhorro{
    private int penalizacion;

    public CuentaDeAhorroEsp(String DNI, int numeroDeCuenta, double saldo, int anoDeVencimiento, int penalizacion) {
        super(DNI, numeroDeCuenta, saldo, anoDeVencimiento);
        this.penalizacion = penalizacion;
    }

    public int getPenalizacion() {
        return penalizacion;
    }

    @Override
    public void retriarDinero(double retirarAmount) throws SaldoNegativo{
        double conPenalizacion = retirarAmount * (1 + ((double) this.penalizacion / 100));
        if(super.getSaldo() >= conPenalizacion){
            super.setSaldo(super.getSaldo() - conPenalizacion);
            System.out.println("Dinero retirado con penalizacion con exito. Tu saldo es: " + super.getSaldo());
        }else{
            throw new SaldoNegativo("Dinero retirado con penalizacion fallado.");
        }
    }

    @Override
    public String toString() {
        return "CuentaDeAhorroEsp: " + super.toString() +" penalizacion=" + penalizacion;
    }
}
