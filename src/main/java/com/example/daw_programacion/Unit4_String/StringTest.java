package com.example.daw_programacion.Unit4_String;

public class StringTest {
    public static void main(String[] args) {
        // String is immutable
        // ⚠ however....Sting pool!

        // use string pool, so same memory, same value
        String cadena1 = "Hello";
        String cadena2 = "Hello";
        // in string, string pool exists,
        // so if a string with same value exists, does not create new instance
        System.out.println(cadena1.equals(cadena2)); // true
        System.out.println(cadena1 == cadena2); // true

        // if you use "new" to create new instance
        // not in string pool, so not same memory even same value
        String cadena3 = new String("Hello");
        String cadena4 = new String("Hello");
        System.out.println(cadena3.equals(cadena4)); // true
        System.out.println(cadena3 == cadena4); // false

        // use .intern() to use == and compare values
        System.out.println(cadena3.intern() == cadena4.intern()); // true

        System.out.println(cadena2.equals(cadena3)); // true
        System.out.println(cadena2 == cadena3); // false

        String cadena5 = new String("Hello");
        String cadena6 = cadena5;
        System.out.println(cadena5.equals(cadena6)); // true
        System.out.println(cadena5 == cadena6); // true

        // 👉👉👉👉 So if you want to compare values, just use .equals()



    }
}
