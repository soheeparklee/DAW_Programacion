package com.example.daw_programacion.UD1_4.Unit4_Array;


public class MultiDimensionArray {
    public static void main(String[] args) {
        int [][] matriz = {{2, 3, 4, 5}, {4, 2, 1}, {7, 2}};

        /*
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) { //remember j should be smaller than matriz[i].length
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

         */

        /*
        2 3 4 5
        4 2 1
        7 2
         */

        boolean find = false;
        for (int i = 0; i < matriz.length && !find; i++) {
            for (int j = 0; j < matriz[i].length && !find; j++) { //remember j should be smaller than matriz[i].length

                if(matriz[i][j] == 5){
                    find = true;
                }

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // 2 3 4 5

        for (int[] innerArr : matriz) {
            for (int i : innerArr) {

                if(i == 5){
                    break;
                }

                System.out.print(i);
            }
            System.out.println();
        }

        /*
        234
        421
        72
         */
    }
}
