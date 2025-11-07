package com.example.daw_programacion.Unit4_Array;

import java.util.Arrays;

public class Matriz {
    private int tamaño;
    private int [][] datos;

    public Matriz(int tamaño) {
        this.tamaño = tamaño;
        datos = new int[tamaño][tamaño];
    }

    public int getTamaño() {
        return tamaño;
    }

    public int[][] getDatos() {
        return datos;
    }

    public void asignarDatos(int[] vector){
        int num=0;

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                datos[i][j] = vector[num];
                num++;
            }
        }

        /*


         */
    }

    public void suma(Matriz matriz){
        for (int i = 0; i < matriz.tamaño; i++) {
            for (int j = 0; j < matriz.tamaño; j++) {
                datos[i][j] += matriz.datos[i][j];
            }
        }
    }

    public void producto(Matriz matriz){
        for (int i = 0; i < matriz.tamaño; i++) {
            for (int j = 0; j < matriz.tamaño; j++) {
                datos[i][j] *= matriz.datos[i][j];
            }
        }
    }

    public void traspuesta(){
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                this.datos[j][i] = datos[i][j];
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int[] datoArr : this.datos) {
            for (int i: datoArr){
                result.append(i);
            }
            result.append( '\n' );
        }
        result.append( '\n' );
        result.append("--------------");
        result.append( '\n' );
        return result.toString();
    }
}
