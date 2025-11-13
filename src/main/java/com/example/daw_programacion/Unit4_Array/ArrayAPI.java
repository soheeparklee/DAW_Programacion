package com.example.daw_programacion.Unit4_Array;

import java.util.Arrays;

public class ArrayAPI {
    public static void main(String[] args) {
        int num[]={8, 10, 15, 20, 21, 25, 30, 32, 40, 41};

        //1. Devuelve un 4
        System.out.println("Metodo binarySearch: "+ Arrays.binarySearch(num, 21));

        //2. Copia el array num hasta la quinta posicion(este ultimo no incluido), devuelve un array
        int num2[]=Arrays.copyOf(num, 4);
        int num12[]=Arrays.copyOf(num, 10);
        System.out.println("Metodo copyOf ");
        //Lo recorremos para ver que lo realiza correctamente
        muestraArray(num2);

        //3. Copia el array num de la tercera hasta la octava posicion, devuelve un array
        int num3[]=Arrays.copyOfRange(num, 2, 6);
        System.out.println("Metodo copyOfRange");
        muestraArray(num3);

        //4. Compara si num1 y num2 no son iguales
        System.out.println("Metodo equals: "+Arrays.equals(num, num2)); //false
        System.out.println("Metodo equals: "+Arrays.equals(num, num12)); //true

        //5. Fill an array with the same number
        System.out.println("Metodo fill");
        Arrays.fill(num3, 5);
        muestraArray(num3);

        //6. Change Array to String
        System.out.println("Metodo toString");
        System.out.println(Arrays.toString(num));
    }

    public static void muestraArray(int num[]){

        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }

    }
}
