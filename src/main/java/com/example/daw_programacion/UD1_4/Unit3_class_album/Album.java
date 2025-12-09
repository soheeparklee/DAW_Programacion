package com.example.daw_programacion.UD1_4.Unit3_class_album;

public class Album {
    private String titulo;
    private String autor;
    private String discográfia;
    private int año;
    private Soporte soporte;
    private int elementos;
    private double precio;
    private Genero genero;
    private boolean español;

    public Album(String titulo, String autor, String discográfia, int año, Soporte soporte, int elementos, double precio, Genero genero, boolean español) {
        this.titulo = titulo;
        this.autor = autor;
        this.discográfia = discográfia;
        this.año = año;
        this.soporte = soporte;
        this.elementos = elementos;
        this.precio = precio;
        this.genero = genero;
        this.español = español;
    }

    public Album() {
    }

    public Album(Album album, Soporte soporte){ //❌
        this.titulo = album.titulo;
        this.autor = album.autor;
        this.discográfia = album.discográfia;
        this.año = album.año;
        this.soporte = soporte; //❌
        this.elementos = album.elementos;
        this.precio = album.precio;
        this.genero = album.genero;
        this.español = album.español;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getDiscográfia() {
        return discográfia;
    }

    public void setDiscográfia(String discográfia) {
        this.discográfia = discográfia;
    }

    public int getElementos() {
        return elementos;
    }

    public void setElementos(int elementos) {
        this.elementos = elementos;
    }

    public boolean isEspañol() {
        return español;
    }

    public void setEspañol(boolean español) {
        this.español = español;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Soporte getSoporte() {
        return soporte;
    }

    public void setSoporte(Soporte soporte) {
        this.soporte = soporte;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /*
    @Override
    public String toString() {
        return "Album{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", discográfia='" + discográfia + '\'' +
                ", año=" + año +
                ", soporte=" + soporte +
                ", elementos=" + elementos +
                ", precio=" + precio +
                ", genero=" + genero +
                ", español=" + español +
                '}';
    }

     */

    

    @Override
    public String toString() {
        return "Datos del álbum" + '\n' +
                "Titulo:        " + titulo + '\n' +
                "Autor:         " + autor + '\n' +
                "Discográfia :  " + discográfia + '\n' +
                "Año:           " + año + '\n' +
                "Soporte (num): " + soporte + "(" + elementos + ")"  + '\n' +
                "Precio:        " + precio + '\n' +
                "Género:        " + genero + '\n' +
                "Español:       " + español;
    }

    //❌
    public double calcularPrecio(Album album) {
        return this.precio + album.precio;
    }

    //❌
    public double calcularPrecio(Album album, double iva) {
        return (this.precio + album.precio)*(1 + iva * 0.01);
    }

}
