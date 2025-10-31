package com.example.daw_programacion.Unit3_class_album;

public class PruebaAlbum {
    public static void main(String[] args) {
        Album album1 = new Album("Crazy Hits", "Crazy Frog", "Blanco y Negro", 2005, Soporte.CD, 1, 14.99, Genero.DANCE, false);
        Album album2 = new Album("Hits de 2024 de España", "Hit productions", "Rojo y Azul", 2025, Soporte.DISCO, 5, 29.99, Genero.POP, true);

        Album album3 = new Album(album2);
        System.out.println(album1.imprimirAlbum());
        System.out.println(album3.imprimirAlbum());

        System.out.println("Precio total (sin IVA): "+ album1.calcularPrecio(album2) + " euros");
        System.out.println("Precio total (con 16% IVA): " + album1.calcularPrecio(album2, 16) + " euros");
    }
}
