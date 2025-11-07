package com.example.daw_programacion.Unit4_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class Alumno {
    private String nombre;
    private LocalDate bDay;
    private int año;

    public Alumno(String nombre, LocalDate bDay) {
        this.nombre = nombre;
        this.bDay = bDay;
        this.año = LocalDate.now().getYear() - bDay.getYear();
    }

    public Alumno(String nombre, int year, int month, int date) {
        this.nombre = nombre;
        this.bDay = LocalDate.of(year, month, date);
        this.año = LocalDate.now().getYear() - bDay.getYear();
    }

    public int getEdad(){
        return Period.between(bDay, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", bDay=" + bDay +
                ", año=" + año +
                '}';
    }

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Alex", LocalDate.of(2010, 1, 8));
        System.out.println(alumno1.toString());

        Alumno alumno2 = new Alumno("Annie", 2000, 12, 8);
        System.out.println(alumno2.toString());
    }
}
