package com.example.daw_programacion.Collections.ejercicioPDF;

import java.util.ArrayList;

public class Ejercicio3<T> {
    private ArrayList<T> list;

    public Ejercicio3() {
        this.list = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Ejercicio3{" +
                "list=" + list +
                '}';
    }

    void insertarAlPrincipio(T nuevo){
        list.add(0, nuevo);
    }

    void insertarAlFinal(T nuevo){
        list.add(nuevo);
    }

    T extraerDelPrincipio(){
        return list.remove(0);
    }

    T extraerDelFinal(){
        return list.remove(list.size()-1);
    }
}
