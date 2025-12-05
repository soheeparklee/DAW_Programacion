package com.example.daw_programacion.Collections;

import java.util.Objects;

public class Alumno {
    private String firstName;
    private String lastName;
    private int year;
    private int month;
    private int date;

    public Alumno(String firstName, String lastName, int year, int month, int date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.month = month;
        this.date = date;
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", year=" + year +
                ", month=" + month +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return year == alumno.year && month == alumno.month && date == alumno.date && Objects.equals(firstName, alumno.firstName) && Objects.equals(lastName, alumno.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, year, month, date);
    }
}
