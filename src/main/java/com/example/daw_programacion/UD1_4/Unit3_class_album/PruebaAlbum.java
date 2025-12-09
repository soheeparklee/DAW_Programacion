package com.example.daw_programacion.UD1_4.Unit3_class_album;

public class PruebaAlbum {
    public static void main(String[] args) {
        Album album1 = new Album("Crazy Hits", "Crazy Frog", "Blanco y Negro", 2005, Soporte.CD, 1, 14.99, Genero.DANCE, false);
        Album album2 = new Album("Hits de 2024 de España", "Hit productions", "Rojo y Azul", 2025, Soporte.DISCO, 5, 29.99, Genero.POP, true);

        System.out.println(album1); // print using toString()

        Album album3 = new Album(album2, Soporte.CD);

        //System.out.println(album1.toString());
        //System.out.println(album3.toString());

        System.out.println("Precio total (sin IVA): "+ album1.calcularPrecio(album2) + " euros");
        System.out.println("Precio total (con 16% IVA): " + album1.calcularPrecio(album2, 16) + " euros");

        Album[] albumsArray = new Album[3];
        albumsArray[0] = album1;
        albumsArray[1] = album2;
        albumsArray[2] = new Album("Hola Hola", "Hola productions", "Rojo", 2012, Soporte.DISCO, 5, 10.99, Genero.POP, true);

        //get the sum of price of array
        float sum = 0;
        for (Album album : albumsArray) {
            sum += album.getPrecio();
        }
        System.out.println(sum);
    }
}
