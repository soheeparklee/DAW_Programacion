package com.example.daw_programacion.UD1_4.Unit4_Array;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int [] numeros1 ={4, 1, 5, 8, 3};
        int [] numeros2 = numeros1.clone();
        int [] numeros3 = {1, 1, 1, 1, 1};
        int [] numeros4 = numeros1;

        System.out.println(numeros1 == numeros2); //false
        System.out.println(numeros1.equals(numeros2)); //false

        //to compare array, use import java.util.Arrays;
        // compare values
        //두 array의 reference달라도 value같으면 true
        System.out.println(Arrays.equals(numeros1, numeros2)); //true
        System.out.println(Arrays.compare(numeros1, numeros2)); //0, vuelve 0 si el mismo

        //두 array의 value다르면 false
        System.out.println(Arrays.equals(numeros1, numeros3)); //false
        System.out.println(Arrays.compare(numeros1, numeros3)); //1

        //두 array의 reference같고 value같으면 true
        System.out.println(Arrays.equals(numeros1, numeros4)); //true
        System.out.println(Arrays.compare(numeros1, numeros4)); //0
    }
}
