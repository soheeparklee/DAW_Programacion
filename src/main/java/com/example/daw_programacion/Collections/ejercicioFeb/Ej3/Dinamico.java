package com.example.daw_programacion.Collections.ejercicioFeb.Ej3;

import java.util.ArrayList;

public class Dinamico<T>{
    private ArrayList<T> list;

    public Dinamico(ArrayList<T> list) {
        this.list = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Dinamico{" +
                "list=" + list +
                '}';
    }

    void insertarAlPrincipio(T nuevo){
        this.list.addFirst(nuevo);
    }

    void insertarAlFInal(T nuevo){
        this.list.addLast(nuevo);
    }

    T extraerDelPrincipio(){
        return this.list.remove(0);
    }

    T extraerDelFinal(){
        return this.list.remove(this.list.size()-1);
    }
}
