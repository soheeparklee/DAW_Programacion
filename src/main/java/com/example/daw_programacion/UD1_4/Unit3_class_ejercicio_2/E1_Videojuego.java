package com.example.daw_programacion.UD1_4.Unit3_class_ejercicio_2;

public class E1_Videojuego {
    private String título;
    private String género;
    private String plataforma;
    private double precio;

    public E1_Videojuego(String titulo, String género, String plataforma, double precio){
        this.título = titulo;
        this.género = género;
        this.plataforma = plataforma;
        this.precio = precio;
    }

    public E1_Videojuego(String titulo, String género){
        this.título = titulo;
        this.género = género;
        this.plataforma = "PS5";
        this.precio = 69.90;
    }

    public void monstrarInformacion(){
        System.out.println(" título: " + título + " género: " + género + " plataforma: " + plataforma + " precio: " + precio);
    }
    public void aplicarDescuento(double porcentaje){
        this.precio = this.precio * (1.0 - porcentaje);
    }
    public void cambiarPrecio(double nuevoPrecio){
        this.precio = nuevoPrecio;
    }
}
