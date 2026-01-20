package com.example.daw_programacion.OOP.Coche;

public class Coche extends Vehiculo{
    private boolean maletero;

    public Coche(String matricula, int numRuedas, boolean maletero) {
        super(matricula, numRuedas);
        this.maletero = maletero;
    }

    @Override
    void acelerar() {
        System.out.println("Coche acelerando con motor de gasolina"); }
    @Override
    void frenar() {
        System.out.println("Coche frenando con pastillas de freno"); }

}
