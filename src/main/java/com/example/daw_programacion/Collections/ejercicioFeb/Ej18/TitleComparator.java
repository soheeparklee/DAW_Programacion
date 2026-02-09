package com.example.daw_programacion.Collections.ejercicioFeb.Ej18;

import java.util.Comparator;

public class TitleComparator implements Comparator<Libro> {
    @Override
    public int compare(Libro o1, Libro o2) {
        return o1.getTitle().compareToIgnoreCase(o2.getTitle());
    }
}
