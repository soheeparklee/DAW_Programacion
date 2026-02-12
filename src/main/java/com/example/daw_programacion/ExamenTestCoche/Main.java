package com.example.daw_programacion.ExamenTestCoche;

import com.example.daw_programacion.ExamenTestCoche.Exceptions.DiasInvalidosException;
import com.example.daw_programacion.ExamenTestCoche.modulo.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Turismo turismo1 = new Turismo("A489", "Kia", 2020, 29.9, 4);
        Turismo turismo2 = new Turismo("I9438", "Toyota", 1980, 49.9, 4);
        Furgoneta furgoneta1 = new Furgoneta("J4839", "Hyundai", 1990, 19.9,  40);
        Furgoneta furgoneta2 = new Furgoneta("P4334", "Benz", 1999, 16.9,  100);
        VehiculoElectronico ve1 = new VehiculoElectronico("N3408", "BMW", 2009, 51.9, 1, 50);
        VehiculoElectronico ve2 = new VehiculoElectronico("H2390", "Seat", 2013, 13.9, 19, 30);
        VehiculoElectronico ve3 = new VehiculoElectronico("T3490", "Tesla", 2008, 99.9, 3, 100);
        VehiculoElectronico ve4 = new VehiculoElectronico("H2390", "Range Rover", 2014, 33.9, 11, 20);

        Empresa empresa = new Empresa();
        empresa.addVehiculo(turismo1);
        empresa.addVehiculo(turismo2);
        empresa.addVehiculo(furgoneta1);
        empresa.addVehiculo(furgoneta2);
        empresa.addVehiculo(ve1);
        empresa.addVehiculo(ve2);
        empresa.addVehiculo(ve3);
        empresa.addVehiculo(ve4);

        System.out.println(empresa.totalFacturacion());
        System.out.println(empresa.mayorAutonomia().monstrarInformacion());

        Scanner sc = new Scanner(System.in);
        String matricula;
        do{
            System.out.println("Pide matricula. Entra 0 para salir ");
            matricula = sc.nextLine();
            boolean vehiculoFound = false;
            for (Vehiculos vehiculo : empresa.getVehiculoList()) {
                if(vehiculo.getMatricula().equals(matricula)){
                    vehiculoFound = true;
                    System.out.println("Pide numero de dias para alquiler");
                    int dias = Integer.parseInt(sc.nextLine());
                    try{
                        vehiculo.setNumeroDias(dias);
                    }catch(DiasInvalidosException e){
                        System.out.println(e.getMessage());
                    }
                }
            }
            if(!vehiculoFound){
                System.out.println("Vehiculo not found.");
            }
        }while(!matricula.equals("0"));


    }
}
