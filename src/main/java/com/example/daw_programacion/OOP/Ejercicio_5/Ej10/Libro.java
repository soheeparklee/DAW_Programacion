package com.example.daw_programacion.OOP.Ejercicio_5.Ej10;

public class Libro implements ProductoVendible{
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String genero;
    private double precioBase;
    private double descuenteGenero;

    //2. how to use switch in constructor
    public Libro(String titulo, String autor, int anioPublicacion, String genero, double precioBase) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.genero = genero;
        this.precioBase = precioBase;
        switch (this.genero){
            case "CienciaFicción":
                case "Fantasia":
                this.descuenteGenero = 15.0;
                break;
            case "Historia" :
                this.descuenteGenero = 5.0;
                break;
            default:
                this.descuenteGenero = 0;
                break;
        }
    }

    @Override
    public double calcularPrecioFinal(){
        return this.precioBase * (1-this.descuenteGenero/100);
    }
    @Override
    public String obtenerDescripcion(){
        return "Titulo del libro: " + titulo + '\n' +
                "Autor: " + autor + '\n' +
                "Anio de Publicacion: " + anioPublicacion + '\n' +
                "Genero: " + genero + '\n' +
                "Precio Base: " + precioBase;
    }
}
