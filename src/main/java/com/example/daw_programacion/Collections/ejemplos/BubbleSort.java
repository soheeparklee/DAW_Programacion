package com.example.daw_programacion.Collections.ejemplos;

import java.util.Arrays;

public class BubbleSort    {
    public static void main (String [] args)
    {
        int [] numeros = new int [10000];
        numeros[0] = 1;
        for (int i=0; i< numeros.length;i++)
        {
            numeros[i] = (int)(Math.random() *10000) + 1;
        }
        System.out.println(Arrays.toString(numeros));

        int [] numeros2 = Arrays.copyOf(numeros,numeros.length);
        long time_start, time_end;
        time_start = System.currentTimeMillis();
        Arrays.sort(numeros);// ordenamos con sort
        time_end = System.currentTimeMillis();
        System.out.println("Tiempo quicksort "+ ( time_end - time_start ) +" milliseconds");

        time_start = System.currentTimeMillis();
        bubbleSort(numeros2);// ordenamos con sort
        time_end = System.currentTimeMillis();
        System.out.println("Tiempo quicksort "+ ( time_end - time_start ) +" milliseconds");
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numeros2));


    }

    public static void bubbleSort(int [] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }



    /*
    // An optimized version of Bubble Sort
    static void bubbleSort(int arr[], int n){
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }

     */

}


