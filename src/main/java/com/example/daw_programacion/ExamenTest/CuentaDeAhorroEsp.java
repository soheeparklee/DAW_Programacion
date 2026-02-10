package com.example.daw_programacion.ExamenTest;

public class CuentaDeAhorroEsp extends CuentaDeAhorro{
    private int penalizacion;

    public CuentaDeAhorroEsp(String DNI, double saldo, int anoDeVencimiento, int penalizacion) {
        super(DNI, saldo, anoDeVencimiento);
        this.penalizacion = penalizacion;
    }

    @Override
    boolean retriarDinero(int retirarAmount) {
        int conPenalizacion = retirarAmount*(1+penalizacion/100);
        if(super.getSaldo() >= conPenalizacion){
            super.setSaldo(super.getSaldo()-conPenalizacion);
            System.out.println("Dinero retirado con penalizacion con exito. Tu saldo es: " + super.getSaldo());
            return true;
        }else{
            System.out.println("Dinero retirar con penalizacion fallado");
            return false;
        }
    }
}
