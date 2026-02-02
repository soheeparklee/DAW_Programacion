package com.example.daw_programacion.OOP.Ejercicio_5.Ej8;

import java.util.ArrayList;

public class Factura implements Imprimible{

    private ArrayList<Compra> compraList;

    public Factura() {
        this.compraList = new ArrayList<>();
    }

    public ArrayList<Compra> getCompraList() {
        return compraList;
    }

    @Override
    public void imprimir() {
        double total = 0;
        System.out.println("======Imprimiendo factura=====");

        for (Compra compra : compraList) {
            System.out.println("product: " + compra.getProducto() + " precio: " + compra.getPrecio());
            total += compra.getPrecio();
        }
        System.out.println("Precio total: " + total);
        System.out.println("==============================");

    }
}
