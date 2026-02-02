package com.example.daw_programacion.OOP.Ejercicio_5.Ej10;

import java.util.ArrayList;

public class CarritoCompra { //1. a class can make interface list
    private ArrayList<ProductoVendible> list;

    public CarritoCompra() {
        this.list = new ArrayList<>();
    }

    public ArrayList<ProductoVendible> getList() {
        return list;
    }

    public void agregarProducto(ProductoVendible producto){
        System.out.println(producto.obtenerDescripcion());
        list.add(producto);

        String tipo = "";
        if(producto instanceof Libro){
            tipo = "Libro";
        }else if(producto instanceof VideoJuego){
            tipo = "Videojuego";
        }
        System.out.println(tipo + "agregado al carrito");
    }

    public void mostrarResumenCompra() {
        for (ProductoVendible producto : list) {
            //3. instance of
            if(producto instanceof Libro){
                System.out.print("Libro: ");
                System.out.println(producto.obtenerDescripcion());
                System.out.println("Precio final: " + producto.calcularPrecioFinal());
            }else if(producto instanceof VideoJuego){
                System.out.print("Videojuego: ");
                System.out.println(producto.obtenerDescripcion());
                System.out.println("Precio final: " + producto.calcularPrecioFinal());
            }
            System.out.println("Total a pagar: " + calcularTotal());
        }
    }
    public double calcularTotal() {
        double total = 0;
        for (ProductoVendible producto : list) {
            total += producto.calcularPrecioFinal();
        }
        return total;
    }
}
