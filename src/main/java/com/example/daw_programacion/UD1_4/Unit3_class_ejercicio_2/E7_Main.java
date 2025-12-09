package com.example.daw_programacion.UD1_4.Unit3_class_ejercicio_2;

public class E7_Main {
    public static void main(String[] args) {
        E7_Calendario c1 = new E7_Calendario(2025, 10, 23);

        E7_Calendario c2 = new E7_Calendario(2025, 10, 29);

        boolean result = c1.iguales(c2);
        System.out.println(result);

        c2.incrementarDia();
        c2.incrementarDia();
        c2.incrementarDia();
        c2.incrementarDia();
        c2.incrementarDia();
        int dia = c2.getDia();
        System.out.println(dia);

    }
}
