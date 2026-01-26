package com.example.daw_programacion.OOP.Ejercicio_3.version2;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContratoTemporal extends Contrato{
    private int duraionEnMeses;

    public ContratoTemporal(Empresa empresa, String empleado, Puesto puesto, Nivel nivel, int salario, LocalDate fechaInicio, int duraionEnMeses) {
        super(empresa, empleado, puesto, nivel, salario, fechaInicio);
        this.duraionEnMeses = duraionEnMeses;
    }

    @Override
    public String monstrarContrato() {
        return "ContratoTemporal - Empleado: " + super.getEmpleado() +
                " duraionEnMeses=" + duraionEnMeses + " meses";
    }

    //Se debe permitir renovar el contrato por un número adicional de meses
    public void renovarContrato(int meses){
        this.duraionEnMeses += meses;
    }
}
