package com.example.daw_programacion.OOP.Ejercicio_4.Ej3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("lapiz1", 3.99, "12A");
        Producto p2 = new Producto("lapiz2", 5.99, "12A");
        Producto p3 = new Producto("boli", 13.99, "16F");
        Producto p4 = new Producto("pantalon", 20.01, "D9A");
        Producto p5 = new Producto("camisa", 19.99, "93J");
        Producto p6 = new Producto("calcetin", 1.99, "9E");

        ArrayList<Producto> productList = new ArrayList<>();
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        productList.add(p6);

        for (Producto producto : productList) {
            if(p1.equals(producto)){
                System.out.println("Equals");
            }else{
                System.out.println("Not equals");
            }
        }
    }
}
