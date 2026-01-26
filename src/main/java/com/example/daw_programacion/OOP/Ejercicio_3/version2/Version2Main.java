package com.example.daw_programacion.OOP.Ejercicio_3.version2;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Version2Main {
    public static void main(String[] args) {

        //1. Creación de contratos
        //temporal
        System.out.println("--------1--------");
        ContratoTemporal c1 = new ContratoTemporal(Empresa.BBVA_IT, "Ana", Puesto.GERENTE, Nivel.EXPERTO, 3000, LocalDate.of(2020, 12, 03), 10);
        ContratoTemporal c2 = new ContratoTemporal(Empresa.SOFTDEV, "Jose", Puesto.ARQUITECTO_SOFTWARE, Nivel.LIDER_TECNICO, 5500, LocalDate.of(2018, 10, 03), 10);
        //indefinido
        ContratoIndefinido c3 = new ContratoIndefinido(Empresa.INNOVATECH, "Hubo Perez", Puesto.DESARROLLADOR, Nivel.SENIOR, 2000, LocalDate.of(2023, 11, 12));
        Coche cocheC4 = new Coche("Kia", 300);
        ContratoIndefinido c4 = new ContratoIndefinido(Empresa.NTT_DATA, "Jenny", Puesto.GERENTE, Nivel.SENIOR, 1700, LocalDate.of(2013, 04, 12), cocheC4);
        // Los contratos creados deben almacenarse en una lista para su posterior gestión.
        ArrayList<Contrato> contratoList = new ArrayList<>();
        contratoList.add(c1);
        contratoList.add(c2);
        contratoList.add(c3);
        contratoList.add(c4);

        //2. Mostrar la información de los contratos
        System.out.println("--------2--------");
        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String text = datetime.format(formatter);
        System.out.println("Monstrando contratos en fecha: " + text);

        //mostrar los datos de cada contrato, aplicando polimorfismo
        //instanceof
        for (Contrato contrato : contratoList) {
            if(contrato instanceof ContratoIndefinido){
                ContratoIndefinido downcast = (ContratoIndefinido)contrato;
                System.out.println(downcast.monstrarContrato());
            }else{
                ContratoTemporal downcast = (ContratoTemporal)contrato;
                System.out.println(downcast.monstrarContrato());
            }
        }

        //3. Aumento de salario
        System.out.println("--------3--------");
        System.out.println(c1.getSalario());
        c1.incrementarSalario(10);
        System.out.println(c1.getSalario());

        //4. Renovación de un contrato temporal
        System.out.println("--------4--------");
        System.out.println(c1.monstrarContrato());
        c1.renovarContrato(10);
        System.out.println(c1.monstrarContrato());

        //5. Rescisión de contrato
        System.out.println("--------5--------");
        System.out.println(c1.totalDeContratos());
        c1.rescindirContrato();
        System.out.println(c1.totalDeContratos());

        //6. Gestión de beneficios y gastos
        System.out.println("--------6--------");
        c2.otorgarBeneficio(BeneficioSocial.TRANSPORTE);
        c2.otorgarBeneficio(BeneficioSocial.FORMACION);
        c2.incluirGasto(GastoIncluido.INTERNET);
        c2.incluirGasto(GastoIncluido.GASOLINA);

        c3.otorgarBeneficio(BeneficioSocial.PLAN_DE_PENSIONES);
        c3.otorgarBeneficio(BeneficioSocial.SEGURO_MEDICO);
        c3.otorgarBeneficio(BeneficioSocial.FORMACION);
        c3.incluirGasto(GastoIncluido.TRANSPORTE_COCHE);
        c3.incluirGasto(GastoIncluido.TRANSPORTE_AVION);
        c3.incluirGasto(GastoIncluido.TRANSPORTE_ALQUILER);
        c3.incluirGasto(GastoIncluido.INTERNET);

        System.out.println(c2.getBeneficiosSociales());
        System.out.println(c2.getGastosCubiertos());
        System.out.println(c3.getBeneficiosSociales());
        System.out.println(c3.getGastosCubiertos());


        //7. Visualización de salarios
        System.out.println("--------7--------");
        System.out.println(c3.getSalario());




    }
}
