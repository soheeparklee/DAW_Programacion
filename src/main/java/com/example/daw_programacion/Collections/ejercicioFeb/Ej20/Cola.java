package com.example.daw_programacion.Collections.ejercicioFeb.Ej20;

public interface Cola <T>{

    void encolar(T elem);

    T desencolar();
    boolean estaVacia();
    int longitud();
    T primero();

}
