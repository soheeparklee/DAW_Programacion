package com.example.daw_programacion.UD1_4.Test_Dec.ArrayExercicio;

import java.util.Scanner;

public class Ejercicio_Array_1_14 {

    //8. Marca elementos
    public static void monstrar(int[] arr, int n){
        for (int i : arr) {
            if(i % n ==0){
                System.out.print("[" + i + "] ");
            }else{
                System.out.print(i + " ");
            }
        }
    }

    //7 Prime array
    public static void monstarArray(int[] arr){
        System.out.print("Indice: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Valor: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //7 Prime array
    //💡 check if prime number
    public static boolean isPrime(int n){
        if( n <= 1 ) return false;
        if( n== 2 ) return true;
        else{
            for (int i = 2; i < n; i++) {
                if(n % i == 0) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //1. Suma de elementos de un array
/*
        int[] arr = {10, 11, 12, 13, 14};
        int resulto = 0;
        for (int i : arr) {
            resulto += i;
        }
        System.out.println(resulto);
    */

        //2. Monstrar elementos de un array
/*
        Scanner scanner = new Scanner(System.in);
        String input;
        String[] nombreArr = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingreso un nombre: ");
            input = scanner.nextLine();
            nombreArr[i] = input;
        }

        for (String s : nombreArr) {
            System.out.println(s);
        }
*/

        //3. Encontrar el valor máximo en un array
/*
        int[] arr = new int[]{23, 45, 67, 89, 12};
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
        }
        System.out.println(max);
*/

        //4. Pares e Impares
/*
        int[] arrayNum = new int[10];
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = (int) (Math.random() * 100) + 1;
        }

        int paresSum = 0, paresCount = 0, imparesSum = 0, imparesCount = 0;
        for (int i : arrayNum) {
            if( i <= 0){
                System.out.println("Este array solo deja número pares e impares. ");
                break;
            }
            else if(i % 2 == 0){
                paresSum += i;
                paresCount++;
            }else if(i % 2 != 0){
                imparesSum += i;
                imparesCount++;
            }
        }

        System.out.println("Pares promedio: " + paresSum / paresCount);
        System.out.println("Impares promedio: " + imparesSum / imparesCount);
*/

        //5. Invertir el orden de un array
/*
        int[] arrayNum = new int[8];
        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = (int) (Math.random() * 100) + 1;
        }

        for (int i : arrayNum) {
            System.out.print(i + " ");
        }

        int left = 0;
        int right = arrayNum.length-1;
        while(left<right){
            int temp = arrayNum[left];
            arrayNum[left] = arrayNum[right];
            arrayNum[right] = temp;
            left++;
            right--;
        }

        System.out.println("After reverse ");
        for (int i : arrayNum) {
            System.out.print(i + " ");
        }
*/

        //6. Determinar el orden de un array
        //int[] arrayNum = new int[10];
/*
        int[] arrayNum = new int[]{5, 1, 1, 1};
//        for (int i = 0; i < arrayNum.length; i++) {
//            arrayNum[i] = (int) (Math.random() * 100) + 1;
//        }


        for (int i : arrayNum) {
            System.out.print(i + " ");
        }

        boolean ascendente = true;
        boolean descendente = true;
        boolean noOrdeano = true;
        for (int i = 1; i < arrayNum.length; i++) {
            if(arrayNum[i-1] > arrayNum[i]){
                ascendente = false;
            }else if(arrayNum[i-1] < arrayNum[i]){
                descendente = false;
            }
        }


        if(ascendente){
            descendente = false;
            noOrdeano = false;
            System.out.println("ascendente");
        }
        if(descendente){
            ascendente = false;
            noOrdeano = false;
            System.out.println("descendente");
        }
        if(noOrdeano){
            ascendente = false;
            descendente = false;
            System.out.println("no ordenado");
        }

*/


        //7. ⭐️Monstar array e índice colocar primos
/*
        Scanner scanner = new Scanner(System.in);
        int input;
        int[] arrayInicial = new int[10];
        //💡 get array[10] by user input
        for (int i=0; i <arrayInicial.length; i++) {
            System.out.println("Te pido un número para índice " + i);
            input = scanner.nextInt();
            arrayInicial[i] = input;
        }

        System.out.println("Array inicial: ");
        monstarArray(arrayInicial);

        //💡 get how many prime numbers exists
        int count = 0;
        for (int i : arrayInicial) {
            if(isPrime(i)) count++;
        }

        //💡put prime first, then non-prime from "count" index and ++
        int[] arrayPrime = new int[10];
        int index = 0;
        for (int i : arrayInicial) {
            if(isPrime(i)){
                arrayPrime[index] = i;
                index++;
            }else{
                arrayPrime[count] = i;
                count++;
            }
        }

        System.out.println("Array prime: ");
        monstarArray(arrayPrime);


*/




        //8. Marca elementos
/*

        int[] intArr = new int[50];
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            intArr[i] = random.nextInt(401);
        }
        System.out.println("Array generado: ");
        for (int i : intArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quieres resaltar múltiplos de 5 o los múltiples de 7? (Introduce 5 o 7)");
        int input = scanner.nextInt();
        if(input == 5 || input ==7){
            monstrar(intArr, input); //look up!
        }else {
            System.out.println("Solo introduce 5 o 7");
        }


*/

        //9. Suma de elementos de un array bidimensional
/*
        int[][] arrayBidimensional = new int[3][4];
        Random random = new Random();
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 4; j++) {
                arrayBidimensional[i][j] = random.nextInt(100) + 1;
            }
        }

        int sum = 0;
        System.out.println("Array de 3 filas por 4 columnas: ");
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arrayBidimensional[i][j] + " ");
                sum += arrayBidimensional[i][j];
            }
            System.out.println();
        }
        System.out.println("La suma de todos los elementos es: " + sum);

*/


        //10. Monstar elementos de un array bidimensional en formato tabla
/*
        int[][] arrayBidimensional = new int[4][3];
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                arrayBidimensional[i][j] = random.nextInt(19) + 1;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                if(arrayBidimensional[i][j] < 10){
                    System.out.print(arrayBidimensional[i][j] + "    ");
                }else{
                    System.out.print(arrayBidimensional[i][j] + "   ");
                }
            }
            System.out.println();
        }

*/

        //11. Buscar el valor máximo
/*
        int[][] arrayEntero = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arrayEntero[i][j] = random.nextInt(90) +10 ;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arrayEntero[i][j] + " ");
            }
            System.out.println();
        }

        int max = Integer.MIN_VALUE;
        int fila = 0;
        int columna = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(arrayEntero[i][j] > max){
                    max = arrayEntero[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }

        System.out.println("El valor máximo es: " + max);
        System.out.printf("Se encuentra en la posición: fila %d, columna %d", fila, columna);


*/


        //12. Promedio de elementos de cada fila
/*
        int [][] arrayBidimensional = new int[3][5];
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                arrayBidimensional[i][j] = random.nextInt(51);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arrayBidimensional[i][j] + " ");
            }
            System.out.println();
        }



        for (int i = 0; i < 3; i++) {
            int sum = 0;
            int promedio;
            for (int j = 0; j < 5; j++) {
                sum += arrayBidimensional[i][j];
            }
            promedio = (int) sum / 5;
            System.out.printf("Promedio de la fila %d: %d\n", i, promedio);
        }


*/


        //13. Encontrar el número minimo
/*

        int[][] arrayEntero = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arrayEntero[i][j] = (int) (Math.random()*100) + 1;
            }
        }

        for (int i = 0; i < 4; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < 4; j++) {
                if(arrayEntero[i][j] < min){
                    min = arrayEntero[i][j];
                }
            }
            System.out.printf("Minimo de la columna %d: %d \n", i, min);
        }
*/
    }
}
