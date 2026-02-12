package com.example.daw_programacion.ExamenTestCoche.modulo;

import com.example.daw_programacion.ExamenTestCoche.Interface.Asegurable;

public class Furgoneta extends Vehiculos implements Asegurable {
    private double capacidadCarga;

    public Furgoneta(String matricula, String modelo, int anoFabricacion, double precioBasePorDia, double capacidadCarga) {
        super(matricula, modelo, anoFabricacion, precioBasePorDia);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double calcularPrecioAquiler() {
        if(this.capacidadCarga > 1000){
            return super.calcularPrecioAquiler() * 1.1;
        }else{
            return super.calcularPrecioAquiler();
        }
    }

    @Override
    public String monstrarInformacion() {
        return "Furgoneta>>>" +
                super.monstrarInformacion()
                + " capacidadCarga= " + capacidadCarga;
    }

    @Override
    public double calcularSeguro() {
        return this.getPrecioBasePorDia()*1.08;
    }
}
