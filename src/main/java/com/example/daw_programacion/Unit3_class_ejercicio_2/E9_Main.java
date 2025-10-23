package com.example.daw_programacion.Unit3_class_ejercicio_2;

public class E9_Main {
    public static void main(String[] args) {
        E9_Fraccion f1= new E9_Fraccion(1, 4);
        E9_Fraccion f2 = new E9_Fraccion(1, 2);
        E9_Fraccion f3 = new E9_Fraccion();
        E9_Fraccion f4 = new E9_Fraccion(4);

        E9_Fraccion resulto1 = f1.sumar(f2);
        resulto1.monstrar();

        E9_Fraccion resulto2 = f1.restar(f2);
        resulto2.monstrar();

        E9_Fraccion resulto3 = f1.multiplicar(f2);
        resulto3.monstrar();

        E9_Fraccion resulto4 = f1.dividir(f2);
        resulto4.monstrar();
    }
}
