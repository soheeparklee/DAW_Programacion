package com.example.daw_programacion.OOP.Ejercicio_5.Ej7;

public class PagoTarjeta implements MetodoPago{
    private double saldo;

    public PagoTarjeta(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void procesarPago(double cantidad) {
        if(validarTarjeta(cantidad)){
            saldo -= cantidad;
            System.out.println("Pago con exito. Tu saldo ahora es: " + saldo);
        }else{
            System.out.println("No podia pagar");
        }
    }
    public boolean validarTarjeta(double cantidad){
        if(saldo > cantidad) return true;
        else return false;
    }

    public double descontarSaldo() {
        return saldo;
    }
}
