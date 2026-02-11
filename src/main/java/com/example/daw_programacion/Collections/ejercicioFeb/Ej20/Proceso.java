package com.example.daw_programacion.Collections.ejercicioFeb.Ej20;

import java.time.LocalDateTime;

public class Proceso{
    private static int contador = 0;
    private LocalDateTime createdAt;
    private String nombre;
    private double CPUTime;

    public Proceso() {
    }

    public Proceso(double CPUTime) {
        this.CPUTime = CPUTime;
    }

    public Proceso(String nombre, double CPUTime) {
        this.nombre = nombre;
        this.CPUTime = CPUTime;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCPUTime() {
        return CPUTime;
    }

    public void setCPUTime(double CPUTime) {
        this.CPUTime = CPUTime;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Proceso{" +
                "createdAt=" + createdAt +
                ", nombre='" + nombre + '\'' +
                ", CPUTime=" + CPUTime +
                '}';
    }
}
