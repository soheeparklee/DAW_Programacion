package com.example.daw_programacion.OOP;

public class Vehiculo1 {
    private String matriculo;
    private int numRuedas;
    protected boolean electrico;

    public Vehiculo1(String matriculo, int numRuedas) {
        this.matriculo = matriculo;
        this.numRuedas = numRuedas;
    }

    public Vehiculo1(int numRuedas, String matriculo, boolean electrico) {
        this.numRuedas = numRuedas;
        this.matriculo = matriculo;
        this.electrico = electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }

    public void setMatriculo(String matriculo) {
        this.matriculo = matriculo;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public String getMatriculo() {
        return matriculo;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "electrico=" + electrico +
                ", matriculo='" + matriculo + '\'' +
                ", numRuedas=" + numRuedas +
                '}';
    }
}
