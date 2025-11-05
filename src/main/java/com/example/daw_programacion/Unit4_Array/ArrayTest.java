package com.example.daw_programacion.Unit4_Array;

public class ArrayTest {
    public static void main(String[] args) {
        int [] numeros = new int[5];
        numeros[0] = 4;
        numeros[1] = 1;
        numeros[2] = 5;
        numeros[3] = 3;
        numeros[4] = 8;

        for(int i=0; i <= numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }
}
