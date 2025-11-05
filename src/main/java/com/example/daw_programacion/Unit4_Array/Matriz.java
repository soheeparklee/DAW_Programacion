package com.example.daw_programacion.Unit4_Array;

import java.util.Arrays;

public class Matriz {
    private int tamaño;
    private int [][] datos;

    public Matriz(int tamaño) {
        this.tamaño = tamaño;
        datos = new int[tamaño][tamaño];
    }

    public void asignarDatos(int[] vector){
        for (int v : vector) {
            for (int i = 0; i < tamaño; i++) {
                for (int j = 0; j < tamaño; j++) {
                    datos[i][j] = v;
                }
            }
        }
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
        int [][] vectorNuevo = new int[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                vectorNuevo[j][i] = datos[i][j];
            }
        }
    }

    @Override
    public String toString() {
        return "Matriz{" +
                "datos=" + Arrays.toString(datos) +
                '}';
    }
}
