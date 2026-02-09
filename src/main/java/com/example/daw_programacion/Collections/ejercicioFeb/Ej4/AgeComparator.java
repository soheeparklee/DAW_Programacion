package com.example.daw_programacion.Collections.ejercicioFeb.Ej4;

import java.util.Comparator;

public class AgeComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getYear().compareTo(o2.getYear());
        //return Integer.compare(o1.getYear(), o2.getYear());
    }
}
