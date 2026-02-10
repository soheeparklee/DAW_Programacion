package com.example.daw_programacion.ExamenTest;

public class CuentaDeAhorro extends Cuenta{

    private int anoDeVencimiento;

    public CuentaDeAhorro(String DNI, double saldo, int anoDeVencimiento) {
        super(DNI, saldo);
        this.anoDeVencimiento = anoDeVencimiento;
    }



    @Override
    boolean retriarDinero(int retirarAmount) {
        if(super.getSaldo() >= retirarAmount){
            super.setSaldo(super.getSaldo()-retirarAmount);
            System.out.println("Dinero retirado con exito. Tu saldo es: " + super.getSaldo());
            return true;
        }else{
            System.out.println("Dinero retirar fallado");
            return false;
        }
    }
}
