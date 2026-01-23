package com.example.daw_programacion.Collections.ejercicioPDF;

public class Person {
    private String name;
    private String last;

    public Person(String name, String last) {
        this.name = name;
        this.last = last;
    }

    public String getName() {
        return name;
    }

    public String getLast() {
        return last;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast(String last) {
        this.last = last;
    }
}
