package com.example.daw_programacion.UD1_4.Test_Dec.ArrayExercicio;

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

    //❌
    public int getDatos(int i, int j) {
        return datos[i][j];
    }

    public void asignarDatos(int[] vector){
        int num=0;

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                datos[i][j] = vector[num];
                num++;
            }
        }

    }

    public void suma(Matriz matriz){
        for (int i = 0; i < matriz.tamaño; i++) {
            for (int j = 0; j < matriz.tamaño; j++) {
                this.datos[i][j] += matriz.getDatos(i, j);
            }
        }
    }

    //❌ how to multiply a matrix
    public void producto(Matriz matriz){
        int aux;
        int[][] copyMatrix = new int[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                copyMatrix[i][j] = this.datos[i][j];
            }
        }

        for (int i = 0; i < matriz.tamaño; i++) {
            for (int j = 0; j < matriz.tamaño; j++) {
                aux = 0;
                for(int k = 0; k< matriz.tamaño; k++){
                    aux = copyMatrix[i][k] + getDatos(k,j);
                }
                this.datos[i][j] =aux;
            }
        }
    }

    // my version
    public void traspuesta1(){
        int[][] copyMatrix = new int[tamaño][tamaño];
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                copyMatrix[i][j] = this.datos[i][j];
            }
        }

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                this.datos[i][j] = copyMatrix[j][i];
            }
        }
    }
    //answer version
    public void traspuesta2(){
        int temp;

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if(i < j){
                    temp = this.datos[i][j];
                    this.datos[i][j] = this.datos[j][i];
                    this.datos[j][i] = temp;
                }
            }
        }
    }


    /*public String monstar() {
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
    }*/

    public void monstar(){
        for (int[] dato : datos) {
            for (int i : dato) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("----------");
    }
}
