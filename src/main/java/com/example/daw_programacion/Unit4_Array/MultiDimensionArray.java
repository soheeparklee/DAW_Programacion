package com.example.daw_programacion.Unit4_Array;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int [][] matriz = {{2, 3, 4, 5}, {4, 2, 1}, {7, 2}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) { //remember j should be smaller than matriz[i].length
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        /*
        2 3 4 5
        4 2 1
        7 2
         */

        for (int[] innerArr : matriz) {
            for (int i : innerArr) {
                System.out.print(i);
            }
            System.out.println();
        }

        /*
        2345
        421
        72
         */
    }
}
