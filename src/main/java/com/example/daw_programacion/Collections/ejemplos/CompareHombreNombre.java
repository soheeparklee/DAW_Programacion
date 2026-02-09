package com.example.daw_programacion.Collections.ejemplos;

import java.util.Comparator;

// Clase Comparator para comparar personas por eda
public class CompareHombreNombre implements Comparator<Hombre> {

        @Override
        public int compare(Hombre h1, Hombre h2) {

            return h1.getNombre().compareTo(h1.getNombre());
        }

        // [Ana (24), Luis (19), Marta (30)] order by name alphabet
}
