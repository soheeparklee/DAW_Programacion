package com.example.daw_programacion.OOP.Ejercicio_3.version2;

import java.time.LocalDate;
import java.util.ArrayList;

public class ContratoIndefinido extends Contrato{
    private Coche cocheEmpresa;


    public ContratoIndefinido(Empresa empresa, String empleado, Puesto puesto, Nivel nivel, int salario, LocalDate fechaInicios) {
        super(empresa, empleado, puesto, nivel, salario, fechaInicios);
    }

    public ContratoIndefinido(Empresa empresa, String empleado, Puesto puesto, Nivel nivel, int salario, LocalDate fechaInicio, Coche cocheEmpresa) {
        super(empresa, empleado, puesto, nivel, salario, fechaInicio);
        this.cocheEmpresa = cocheEmpresa;
    }

    @Override
    public String monstrarContrato() {
        return "ContratoIndefinido - Empleado: " + super.getEmpleado() + '\n' +
                "cocheEmpresa: " + cocheEmpresa;
    }

    //Asignar un coche

    public void setCocheEmpresa(Coche cocheEmpresa) {
        this.cocheEmpresa = cocheEmpresa;
    }
}
