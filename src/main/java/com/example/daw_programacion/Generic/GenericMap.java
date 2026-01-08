package com.example.daw_programacion.Generic;

public class GenericMap {
    public static void main(String[] args) {
        HashMapGeneric<String, Integer> edadPersona = new HashMapGeneric<>("Ana", 30);
        System.out.println(edadPersona.getClave()); // Ana
        System.out.println(edadPersona.getValor()); // 30
        HashMapGeneric<Integer, String> codigoNombre = new HashMapGeneric<>(101, "Marta");
        System.out.println(codigoNombre); // Par[101 = Marta]
    }

}
