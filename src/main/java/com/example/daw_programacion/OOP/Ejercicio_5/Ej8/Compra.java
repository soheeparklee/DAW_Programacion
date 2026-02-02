package com.example.daw_programacion.OOP.Ejercicio_5.Ej8;

public class Compra {
    private String producto;
    private double precio;

    public Compra(String producto, double precio) {
        this.producto = producto;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public double getPrecio() {
        return precio;
    }
}
