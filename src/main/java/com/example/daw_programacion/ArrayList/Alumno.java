package com.example.daw_programacion.ArrayList;

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
}
