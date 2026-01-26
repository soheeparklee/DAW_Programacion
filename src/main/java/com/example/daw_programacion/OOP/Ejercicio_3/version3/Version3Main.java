package com.example.daw_programacion.OOP.Ejercicio_3.version3;


import java.time.LocalDate;
import java.util.ArrayList;

public class Version3Main {
    public static void main(String[] args) {
        //1.  Creación de Contratos
        ContratoTemporal temp1 = new ContratoTemporal(Empresa.NEXT_DIGITAL, "Josemi", Puesto.DESARROLLADOR, Nivel.EXPERTO, 2500, LocalDate.of(2020, 11, 03), 12);
        ContratoTemporal temp2 = new ContratoTemporal(Empresa.SOFTDEV, "Diego", Puesto.ANALISTA, Nivel.SENIOR, 3200, LocalDate.of(2010, 01, 06), 24);
        ContratoIndefinido indefin1 = new ContratoIndefinido(Empresa.NEXT_DIGITAL, "Cesar", Puesto.GERENTE, Nivel.JUNIOR, 3500, LocalDate.of(2013, 04, 07));

        ArrayList<Contrato> contratoList = new ArrayList<>();
        contratoList.add(temp1);
        contratoList.add(temp2);
        contratoList.add(indefin1);

        //2. Operaciones sobre los Contratos
        temp1.incrementarSalario(10);
        System.out.println(temp1.getSalario());
        temp1.renovarContrato(6);
        System.out.println(temp1.getDuraionEnMeses());
        temp2.rescindirContrato();
        indefin1.otorgarBeneficio(BeneficioSocial.FORMACION);
        indefin1.incluirGasto(GastoIncluido.TRANSPORTE_AVION);
        indefin1.incluirGasto(GastoIncluido.TRANSPORTE_TREN);
        System.out.println(indefin1.getSalario());

        //3. Finalización de Contratos
        System.out.println(indefin1.totalDeContratos());



    }
}
