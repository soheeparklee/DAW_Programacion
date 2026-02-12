package com.example.daw_programacion.ExamenTestCoche.modulo;

import com.example.daw_programacion.ExamenTestCoche.Interface.Asegurable;

public class VehiculoElectronico extends Turismo implements Asegurable {

    private double autonomia;


    public VehiculoElectronico() {
    }

    public VehiculoElectronico(String matricula, String modelo, int anoFabricacion, double precioBasePorDia, int numeroPuertas, double autonomia) {
        super(matricula, modelo, anoFabricacion, precioBasePorDia, numeroPuertas);
        this.autonomia = autonomia;
    }

    public double getAutonomia() {
        return autonomia;
    }

    @Override
    public double calcularPrecioAquiler() {
        return super.calcularPrecioAquiler() * (1+0.05);
    }

    @Override
    public double calcularSeguro() {
        return this.getPrecioBasePorDia()*1.06;
    }

    @Override
    public String monstrarInformacion() {
        return "VehiculoElectronico>>>" +
                super.monstrarInformacion()
                + " autonomia= " + autonomia;
    }
}
