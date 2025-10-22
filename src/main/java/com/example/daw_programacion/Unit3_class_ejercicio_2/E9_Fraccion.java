package com.example.daw_programacion.Unit3_class_ejercicio_2;

public class E9_Fraccion {
    private int num;
    private int den;

    public E9_Fraccion(){
        this.num = 0;
        this.den = 1;
    }
    public E9_Fraccion(int num){
        this.num = num;
        this.den = 1;
    }

    public E9_Fraccion(int num, int den){
        this.num = num;
        this.den = den;
    }

    public E9_Fraccion sumar(E9_Fraccion f){
        return f;
    }
}
