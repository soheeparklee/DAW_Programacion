package com.example.daw_programacion.Unit3_class_ejercicio_2;

public class E4_Ordenador {
    String tipo;
    String color;
    int capacidad;

    public E4_Ordenador(String tipo, String color, int capacidad) {
        this.tipo = tipo;
        this.color = color;
        this.capacidad = capacidad;
    }

    public E4_Ordenador() {
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "E4_Ordenador{" +
                "capacidad=" + capacidad +
                ", tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
