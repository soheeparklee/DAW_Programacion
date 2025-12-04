package com.example.daw_programacion.UD1_4.Unit4_DateTime;

import java.time.LocalDate;
import java.time.Period;



public class Alumno {
    private String nombre;
    private LocalDate bDay;
    private int año;

    //make constructor 1
    //parameter: localDate bday

    /**
     * Este constructor es para...
     * @param nombre
     * @param bDay
     */
    public Alumno(String nombre, LocalDate bDay) {
        this.nombre = nombre;
        this.bDay = bDay;
        this.año = LocalDate.now().getYear() - bDay.getYear();
    }

    //make constructor 2
    //parameter: year, month ,date
    //and change into Localdate into localDate inside constructor
    public Alumno(String nombre, int year, int month, int date) {
        this.nombre = nombre;
        this.bDay = LocalDate.of(year, month, date);
        this.año = LocalDate.now().getYear() - bDay.getYear();
    }

    //use Period.between to get age
    // import java.time.Period;
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

    //Date는 더이상 쓰지 말자
    //왜냐하면 mutable하기 때문에 나중에 multi threading할 때 바뀔 수 있기 때문

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Alex", LocalDate.of(2010, 1, 8));
        System.out.println(alumno1.toString());

        Alumno alumno2 = new Alumno("Annie", 2000, 12, 8);
        System.out.println(alumno2.toString());
    }
}
