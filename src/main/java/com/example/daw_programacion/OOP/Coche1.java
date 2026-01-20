package com.example.daw_programacion.OOP;

public class Coche1 extends Vehiculo1 {
    private int capacidadMaletero;

    public Coche1(int numRuedas, String matriculo, boolean electrico, int capacidadMaletero) {
        //super: constructor de padre, constuir el parte de padre
        super(numRuedas, matriculo, electrico); // attributes of the parent, extended Vehiculo
        this.capacidadMaletero = capacidadMaletero;
    }

    //parent constructor that only recieves two param
    //what should we do, that the child class can access the parent attribute?
    //make attribute access modifier protected
    public Coche1(String matriculo, int numRuedas, int capacidadMaletero, boolean esElectrico) {
        super(matriculo, numRuedas);
        this.electrico = esElectrico; //to acceder electrico, its access modifier must be protected
        this.capacidadMaletero = capacidadMaletero;
    }

    //override toString with template, to also toString the parent attributes
    @Override
    public String toString() {
        return "Coche{" +
                "electrico=" + electrico +
                ", capacidadMaletero=" + capacidadMaletero +
                "} " + super.toString();
    }
}
