package com.example.daw_programacion.Unit3_class_ejercicio_2;

public class E4_Main {
    public static void main(String[] args) {
        E4_Ordenador ordenador1 = new E4_Ordenador();
        ordenador1.setTipo("M1");
        ordenador1.setColor("Gris");
        ordenador1.setCapacidad(64);

        E4_Ordenador ordenador2 = new E4_Ordenador("M2", "Oro", 32);
        String ordenador2Tipo = ordenador2.getTipo();
        String ordenador2Color = ordenador2.getColor();
        int ordenador2Capacidad = ordenador2.getCapacidad();

        System.out.println("tipo: " + ordenador2Tipo + " color: " + ordenador2Color + " capacidad: " + ordenador2Capacidad);
    }
}
