package com.example.daw_programacion.UD1_4.Unit4_Array;

import java.util.Arrays;

public class ArrayDeepEquals {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};

        System.out.println(a == b);            // false ❌
        System.out.println(Arrays.equals(a,b)); // true ✅

        //Using Arrays.equals() or Arrays.deepEquals()
        // ➡️ compares contents (values)

        //💡 Array.equals()
        //shallow compare
        //compare the "value" of the array
        //for primitive array ➡️checks whether each element has the same value ✅
        //for object array ➡️ compare value, use .equals() ✅
        //for nested array ➡️only compare reference, not inner contents ❌

        // primitive array
        int[] a1 = {1, 2, 3};
        int[] a2 = {1, 2, 3};
        System.out.println(Arrays.equals(a1, a2)); // true ✅

        //objective array
        String[] a11 = {"hi", "bye"};
        String[] b11 = {"hi", "bye"};
        Arrays.equals(a11, b11); //true, use String.equals() ✅

        //nested array
        int[][] b1 = {{1, 2}, {3, 4}};
        int[][] b2 = {{1, 2}, {3, 4}};
        System.out.println(Arrays.equals(b1, b2)); // false ❌
        //bc compare reference

        //💡 Array.deepEquals()는 nested multi-dimensional array deep compare 비교하기 위해 존재
        //for object array ➡️ compare inner contents ✅
        //for nested array ➡️ compare recursively ✅
        int[][] c1 = {{1, 2}, {3, 4}};
        int[][] c2 = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepEquals(c1, c2)); // true ✅

        Object[] a22 = { new String[] {"hi", "bye"} };
        Object[] b22 = { new String[] {"hi", "bye"} };
        Arrays.deepEquals(a22, b22); // true ✅
    }
}
