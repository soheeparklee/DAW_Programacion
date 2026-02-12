package com.example.daw_programacion.ExamenTest.modulo;

import com.example.daw_programacion.ExamenTest.excepciones.SaldoNegativo;

public class CuentaDeAhorro extends Cuenta{

    private int anoDeVencimiento;

    public CuentaDeAhorro(String DNI, int numeroDeCuenta, double saldo, int anoDeVencimiento) {
        super(DNI, numeroDeCuenta, saldo);
        this.anoDeVencimiento = anoDeVencimiento;
    }



    @Override
    public void retriarDinero(double retirarAmount) throws SaldoNegativo{
        if(this.getSaldo() >= retirarAmount){
            super.setSaldo(super.getSaldo()-retirarAmount);
            System.out.println("Dinero retirado en cuenta de ahorro con exito. Tu saldo es: " + super.getSaldo());
        }else{
            throw new SaldoNegativo("Dinero retirar en cuenta de ahorro fallado.");
        }
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro: " + super.toString() +  " anoDeVencimiento= " + anoDeVencimiento;
    }
}
