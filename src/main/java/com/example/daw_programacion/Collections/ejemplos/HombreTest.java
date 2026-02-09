package com.example.daw_programacion.Collections.ejemplos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HombreTest {
    public static void main(String[] args) {
        List<Hombre> lista = new ArrayList<>();
        lista.add(new Hombre("Ana", 24));
        lista.add(new Hombre("Luis", 19));
        lista.add(new Hombre("Marta", 30));

        // Usamos la clase CompareHombreAge
        Collections.sort(lista, new CompareHombreAge());
        System.out.println(lista); // [Luis (19), Ana (24), Marta (30)]

        // Usamos la clase CompareHombreNombre
        Collections.sort(lista, new CompareHombreNombre());
        System.out.println(lista); //[Ana (24), Luis (19), Marta (30)]

        List<Mujer> mujerLista = new ArrayList<>();
        mujerLista.add(new Mujer("AnaMujer", 40));
        mujerLista.add(new Mujer("LuisMujer", 20));
        mujerLista.add(new Mujer("MartaMujer", 30));

        //Collections.sort(mujerLista, new CompareHombreAge());



    }
}
