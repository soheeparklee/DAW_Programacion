package com.example.daw_programacion.Generic;

public class Box <T, K>{
    private T contenido;
    private K nombre;

    //getter
    public T getContenido() {
        return contenido;
    }

    //setter
    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public Box(T contenido, K nombre) {
        this.contenido = contenido;
        this.nombre = nombre;
    }
}
