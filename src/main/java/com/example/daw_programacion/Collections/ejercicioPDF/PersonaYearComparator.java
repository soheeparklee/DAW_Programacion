package com.example.daw_programacion.Collections.ejercicioPDF;

import java.util.Comparator;

public class PersonaYearComparator implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return Integer.compare(o1.getAño(), o2.getAño());
    }
}
