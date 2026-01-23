package com.example.daw_programacion.Collections.ejercicioPDF;

import java.util.Comparator;

public class PersonaNameComparator implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}


