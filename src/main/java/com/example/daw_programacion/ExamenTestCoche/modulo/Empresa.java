package com.example.daw_programacion.ExamenTestCoche.modulo;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Vehiculos> vehiculoList;

    public Empresa() {
        this.vehiculoList = new ArrayList<>();
    }

    public ArrayList<Vehiculos> getVehiculoList() {
        return vehiculoList;
    }

    public void addVehiculo(Vehiculos v){
        vehiculoList.add(v);
    }

    public double totalFacturacion() {
        double total = 0;
        for (Vehiculos vehiculos : vehiculoList) {
            total += vehiculos.calcularPrecioAquiler();
        }
        return total;
    }

    public Vehiculos mayorAutonomia(){
        VehiculoElectronico ve = new VehiculoElectronico();
        double autonomiaMax = 0;
        for (Vehiculos vehiculos : vehiculoList) {
            if(vehiculos instanceof VehiculoElectronico){
                VehiculoElectronico current = (VehiculoElectronico) vehiculos;
                if(Math.max(autonomiaMax, current.getAutonomia()) == current.getAutonomia()){
                    autonomiaMax = current.getAutonomia();
                    ve = current;
                }
            }
        }
        return ve;
    }
}
