package com.example.daw_programacion.ExamenTestCoche.modulo;

import com.example.daw_programacion.ExamenTestCoche.Interface.Asegurable;

public class Turismo extends Vehiculos implements Asegurable {
    private int numeroPuertas;

    public Turismo() {
    }

    public Turismo(String matricula, String modelo, int anoFabricacion, double precioBasePorDia, int numeroPuertas) {
        super(matricula,
                modelo,
                anoFabricacion,
                precioBasePorDia);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String monstrarInformacion() {
        return "Turismo>>>> " +
                super.monstrarInformacion() +
                " numeroPuertas= " + numeroPuertas;
    }

    @Override
    public double calcularSeguro() {
        return this.getPrecioBasePorDia()*1.05;
    }
}
