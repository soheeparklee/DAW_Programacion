package com.example.daw_programacion.Unit4_Array;

public class MatrizMain {
    public static void main(String[] args) {
        Matriz matriz1 = new Matriz(3);
        Matriz matriz2 = new Matriz(3);

        int[] vector1 = {3, 2, 1, 1, 2, 3, 2, 3, 1};
        int[] vector2 = { 1, 1, 2, 2, 1, 1, 1, 2, 1};

        matriz1.asignarDatos(vector1);
        matriz2.asignarDatos(vector2);
    }
}
