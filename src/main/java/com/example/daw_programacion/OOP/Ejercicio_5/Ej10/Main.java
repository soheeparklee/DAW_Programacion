package com.example.daw_programacion.OOP.Ejercicio_5.Ej10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro("El Senor De Los Anillos", "J.R.R Tolkien", 1954, "Fantasia", 75);
        VideoJuego videoJuego = new VideoJuego("Baldur's Gate III", "PC", "18", 59);
        ArrayList<ProductoVendible> todoProductos = new ArrayList<>();
        todoProductos.add(libro);
        todoProductos.add(videoJuego);

        CarritoCompra myCarrito = new CarritoCompra();
        explorarCatalogo(todoProductos);

        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.print("+++++++++++Menu++++++++++++\n" +
                    "1. Agregar libro\n" +
                    "2. Agregar videojuego\n" +
                    "3. Ver carrito\n" +
                    "4. Finalizar compra\n" +
                    "Seleccione una opción: ");
             input = sc.nextInt();
            System.out.println("+++++++++++++++++++++++++");

             switch (input){
                 case 1:
                     myCarrito.agregarProducto(libro);
                    break;
                 case 2:
                     myCarrito.agregarProducto(videoJuego);
                     break;
                 case 3:
                     myCarrito.mostrarResumenCompra();
                     break;
            }

        }while(input != 4);
        finalizarCompra();

    }

    public static void finalizarCompra(){
        System.out.println("Compra finalizada. Gracias por su compra.");
    }
    public static void explorarCatalogo(ArrayList<ProductoVendible> todoProductos){
        System.out.println("=========Nuestro productos vendidos========");
        for (ProductoVendible producto : todoProductos) {
            System.out.println(producto.obtenerDescripcion());
        }
        System.out.println("==========================================");
    }
}
