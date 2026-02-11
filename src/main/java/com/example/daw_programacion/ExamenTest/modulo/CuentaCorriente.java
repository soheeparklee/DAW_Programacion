package com.example.daw_programacion.ExamenTest.modulo;

import com.example.daw_programacion.ExamenTest.excepciones.SaldoNegativo;

public class CuentaCorriente extends Cuenta{
    private CuentaDeAhorro cuentaDeAhorro;

    public CuentaCorriente(String DNI, int numeroDeCuenta, double saldo, CuentaDeAhorro cuentaDeAhorro) {
        super(DNI, numeroDeCuenta, saldo);
        this.cuentaDeAhorro = cuentaDeAhorro;
    }


    @Override
    void retriarDinero(double retirarAmount) throws SaldoNegativo {
        if(super.getSaldo() >= retirarAmount){
            super.setSaldo(super.getSaldo()-retirarAmount);
            System.out.println("Dinero retirar en cuenta corriente con exito. Saldo: " + super.getSaldo());
        }else{
            double saldoActual = super.getSaldo();
            if(saldoActual + cuentaDeAhorro.getSaldo() >= retirarAmount){
                super.setSaldo(0);
                double resto = retirarAmount - saldoActual;
                cuentaDeAhorro.setSaldo(cuentaDeAhorro.getSaldo() - resto);
                System.out.println("Dinero retirar en cuenta corriente usando cuenta de ahorro. Saldo de cuenta de ahorro: " + cuentaDeAhorro.getSaldo() + " Saldo de cuenta corriente: " + super.getSaldo());
            }else{
                throw new SaldoNegativo("Dinero retirar en cuenta corriente fallado");
            }
        }
    }

    @Override
    public String toString() {
        return "CuentaCorriente: " + super.toString() + " " + cuentaDeAhorro;
    }


}
