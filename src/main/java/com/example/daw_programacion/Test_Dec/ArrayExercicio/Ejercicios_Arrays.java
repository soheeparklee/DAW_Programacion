package com.example.daw_programacion.Test_Dec.ArrayExercicio;

import java.util.Random;
import java.util.Scanner;

public class Ejercicios_Arrays {
    //2. método veces que se encuentra número de char
    public static int contarVeces(char[] charArr, int num){
        int count = 0;
        for (char c : charArr) {
            if(c == num) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        //1. coger valor con scanner en un array, dar major
        int[] intArr = new int[10];
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("Pido un número: ");
            intArr[i] = sc.nextInt();
            if(intArr[i] > max) max = intArr[i];
        }
        System.out.println("valor mayor: " + max);

        //2. método veces que se encuentra número de char
/*
        char[] charArr = {'a', 'b', 'c', 'A', 'A'};
        System.out.println(contarVeces(charArr, 65));
*/

        //3. Alumno array

        //4. Array aleatorio, check if prime number
/*
        int[] numArr = new int[10];
        Random random = new Random();
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = random.nextInt(99) + 1;
        }

        for (int i : numArr) {
            boolean primo = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    primo = false;
                }
            }
            System.out.println(i + " es primo? " + primo);
        }
*/

        //5. Calcular determinante
/*
        int[][] matriz = new int[3][3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = random.nextInt(9) + 1;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int determinante = matriz[0][0]*(matriz[1][1]*matriz[2][2] - matriz[1][2]*matriz[2][1])
                - matriz[0][1]*(matriz[1][2]*matriz[2][0] - matriz[1][0]*matriz[2][2])
                + matriz[0][2]*(matriz[1][0]*matriz[2][1] - matriz[1][1]*matriz[2][0]);
        System.out.println("determinante: " + determinante );
*/

        //6. Multiplique dos matrices 4*4
/*
        int[][] matriz1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] matriz2 = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        int[][] resulto = new int[4][4];

        int aux;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <4 ; j++) {
                aux = 0;
                for (int k = 0; k < 4; k++) {
                    aux += matriz1[i][k] * matriz2[k][j];
                }
                resulto[i][j] = aux;
            }
        }

        //print result
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(resulto[i][j] + " ");
            }
            System.out.println();
        }

*/

        //7. Matriz representando un triángulo invertido
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Tamaño de matriz: ");
        int input = sc.nextInt();

        char[][] triangulo = new char[input][input];
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input-i; j++) {
                triangulo[i][j] = '*';
            }
        }

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < input-i; j++) {
                System.out.print(triangulo[i][j]);
            }
            System.out.println();
        }
*/

    }
}
