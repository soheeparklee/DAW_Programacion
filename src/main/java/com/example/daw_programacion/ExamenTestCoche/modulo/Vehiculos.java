package com.example.daw_programacion.ExamenTestCoche.modulo;

import com.example.daw_programacion.ExamenTestCoche.Exceptions.DiasInvalidosException;

public abstract class Vehiculos {
    private String matricula;
    private String modelo;
    private int anoFabricacion;
    private double precioBasePorDia;
    private int numeroDias;

    public Vehiculos() {
    }

    public Vehiculos(String matricula, String modelo, int anoFabricacion, double precioBasePorDia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
        this.precioBasePorDia = precioBasePorDia;
        this.numeroDias = 0;
    }

    public double getPrecioBasePorDia() {
        return precioBasePorDia;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    public String getMatricula() {
        return matricula;
    }

    public double  calcularPrecioAquiler(){
        return precioBasePorDia * numeroDias;
    };
    public  String monstrarInformacion(){
        return " matricula= " + matricula +
                " modelo= " + modelo +
                " anoFabricacion= " + anoFabricacion +
                " precioBasePorDia= " + precioBasePorDia +
                " numeroDias= " + numeroDias;
    };

    public boolean checkAlquilarDias(int dias) throws DiasInvalidosException {
        if(dias <= 0){
            throw new DiasInvalidosException("Too little days");
        }else return true;
    }

    public void setNumeroDias(int numeroDias) throws DiasInvalidosException {
        if(!checkAlquilarDias(numeroDias)){
            this.numeroDias = 0;
        } else {
            this.numeroDias = numeroDias;
            System.out.println("Alquilar " + numeroDias + " dias con exito. ");
        }
    }
}
