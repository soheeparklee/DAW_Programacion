package com.example.daw_programacion.OOP.Ejercicio_4.Ej2;

public class Moto extends Vehiculo{
    private boolean tieneSidecar;

    public Moto(String marca, boolean tieneSidecar) {
        super(marca);
        this.tieneSidecar = tieneSidecar;
    }

    public void hacerCaballito(){
        System.out.println("Haciendo caballito");
    }

    @Override
    public String monstarInfo() {
        return "Moto{" +
                "tieneSidecar=" + tieneSidecar +
                '}';
    }
}
