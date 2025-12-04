package com.example.daw_programacion.UD1_4.Unit4_DateTime;

import java.time.LocalDate;

public class TestMain {
    public static void main(String[] args) {
        // LocalDate es immutable
        LocalDate ahora = LocalDate.now(); // sacar la fecha de hoy
        System.out.println(ahora); // 2025-11-07

        LocalDate bDay = LocalDate.of(1990, 5, 20);
        System.out.println(bDay); // 1990-05-20

        // LocalDate es immutable,
        // por eso bDay.plusYears no modifica bDay, crea un nuevo objeto
        // NO modifica el original ❌ crea uno nuevo ⭕
        LocalDate fechaTarde = bDay.plusYears(30);
        System.out.println(bDay); // 1990-05-20
        System.out.println(fechaTarde); // 2020-05-20
    }
}
