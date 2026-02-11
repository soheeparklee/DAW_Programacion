package com.example.daw_programacion.Collections.ejercicioFeb.Ej20;

public class ProcesoPrioritario extends Proceso implements Comparable<ProcesoPrioritario> {
    private int prioridad;

    public ProcesoPrioritario(String nombre, double CPUTime, int prioridad) {
        super(nombre, CPUTime);
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "ProcesoPrioritario{nombre" + super.getNombre() + ", CPUtime = " + super.getCPUTime() + ", prioridad= " + prioridad + ", createdAt= " + super.getCreatedAt() + "}";
    }

    @Override
    public int compareTo(ProcesoPrioritario otro) {
        return Integer.compare(this.prioridad, otro.prioridad);
    }

    public String printEjecutando() {
        return super.getNombre()+ " (CPUTime: " + super.getCPUTime() + " Prioridad: " + prioridad + ")";
    }
}
