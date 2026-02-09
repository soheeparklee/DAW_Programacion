package com.example.daw_programacion.Collections.ejercicioFeb.Ej4;

import java.time.LocalDate;
import java.time.Year;
import java.util.Objects;

public class Persona {
    private String firstName;
    private String lastName;
    private Integer year;

    public Persona(String firstName, String lastName, Integer year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Hello, Soy "+ this.firstName +" " + this.lastName + " nacio en " + this.year;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Persona persona)) return false;
        return Objects.equals(firstName, persona.firstName) && Objects.equals(lastName, persona.lastName) && Objects.equals(year, persona.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, year);
    }
}
