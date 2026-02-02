package com.example.daw_programacion.OOP.Ejercicio_5.Ej7;

public class PagoPayPal implements MetodoPago{
    private String usuario;
    private double comision;

    public PagoPayPal(String usuario, double comision) {
        this.usuario = usuario;
        this.comision = comision;
    }

    @Override
    public void procesarPago(double cantidad) {
        System.out.println("Precio total: " + (cantidad+comision));
        System.out.println("Pago con exito");
    }
    public boolean validarUsuario(String nombre){
        if(nombre.equals(this.usuario)) return true;
        else return false;
    }
}
