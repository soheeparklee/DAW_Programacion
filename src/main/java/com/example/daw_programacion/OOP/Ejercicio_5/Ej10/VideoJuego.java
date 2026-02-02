package com.example.daw_programacion.OOP.Ejercicio_5.Ej10;

public class VideoJuego implements  ProductoVendible{
    private String titulo;
    private String plataforma;
    private String clasificacionEdad;
    private double precioBase;
    private double impuesto;
    private double costoPlataforma;

    public VideoJuego(String titulo, String plataforma, String clasificacionEdad, double precioBase) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.clasificacionEdad = clasificacionEdad;
        this.precioBase = precioBase;
        switch(this.clasificacionEdad){
            case "18":
                this.impuesto = 21;
                break;
            case "12":
                this.impuesto = 10;
                break;
            default:
                this.impuesto = 0;
        }
        if(this.plataforma.equals("PlayStation") || this.plataforma.equals("Xbox")){
            this.costoPlataforma = 5;
        }else{
            this.costoPlataforma = 0;
        }
    }


    @Override
    public double calcularPrecioFinal() {
        return this.precioBase * (1+this.impuesto/100) + this.costoPlataforma;
    }

    @Override
    public String obtenerDescripcion() {
        return "Titulo del videojuego: " + titulo + '\n' +
                "Plataforma: " + plataforma + '\n' +
                "Clasificacion PEGI: " + clasificacionEdad + '\n' +
                "PrecioBase: " + precioBase;
    }

}
