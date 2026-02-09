package com.example.daw_programacion.Collections.ejercicioFeb.Ej4;

import java.util.Comparator;

public class NombreComparator implements Comparator<Persona> {

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
    }
}
