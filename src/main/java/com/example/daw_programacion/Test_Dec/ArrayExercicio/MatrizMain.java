package com.example.daw_programacion.Test_Dec.ArrayExercicio;

public class MatrizMain {
    public static void main(String[] args) {
        Matriz matriz1 = new Matriz(3);
        Matriz matriz2 = new Matriz(3);

        System.out.println(matriz1.toString());

        int[] vector1 = {3, 2, 1, 1, 2, 3, 2, 3, 1};
        int[] vector2 = { 1, 1, 2, 2, 1, 1, 1, 2, 1};

        matriz1.asignarDatos(vector1);
        matriz2.asignarDatos(vector2);
        matriz1.monstar();
        matriz2.monstar();

        matriz1.producto(matriz2);
        matriz1.monstar();

        matriz1.suma(matriz2);
        matriz1.monstar();


        matriz1.traspuesta2();
        matriz1.monstar();





        /*
        Matriz matriz3 = new Matriz(3);
        Matriz matriz4 = new Matriz(3);
        matriz3.asignarDatos(vector1);
        matriz4.asignarDatos(vector2);

        matriz3.producto(matriz4);
        System.out.println(matriz3.toString());


        Matriz matriz5 = new Matriz(3);
        Matriz matriz6 = new Matriz(3);
        matriz5.asignarDatos(vector1);
        matriz6.asignarDatos(vector2);

        matriz5.traspuesta();
        System.out.println(matriz5.toString());

         */
    }
}
