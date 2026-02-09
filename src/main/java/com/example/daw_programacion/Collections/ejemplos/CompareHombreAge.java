package com.example.daw_programacion.Collections.ejemplos;

import java.util.Comparator;

// Clase Comparator para comparar personas por eda
public class CompareHombreAge implements Comparator<Hombre> {


        @Override
        public int compare(Hombre h1, Hombre h2) {
            return Integer.compare(h1.getEdad(), h2.getEdad());
        }
        // [Luis (19), Ana (24), Marta (30)] order by age

}
