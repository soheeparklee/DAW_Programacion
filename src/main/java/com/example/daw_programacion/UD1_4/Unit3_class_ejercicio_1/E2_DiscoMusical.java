package com.example.daw_programacion.UD1_4.Unit3_class_ejercicio_1;

public class E2_DiscoMusical {
    private String titulo;
    private String autor;
    private int añoEdicion;
    private String formato;
    private boolean digital;

    public E2_DiscoMusical(String titulo, String autor, int añoEdicion, String formato, boolean digital){
        this.titulo = titulo;
        this.autor = autor;
        this.añoEdicion = añoEdicion;
        this.formato = formato;
        this.digital = digital;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor(){
        return autor;
    }
    public int getAñoEdicion(){
        return añoEdicion;
    }
    public String getFormato(){
        return formato;
    }
    public boolean getDigital(){
        return digital;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setAñoEdicion(int añoEdicion){
        this.añoEdicion = añoEdicion;
    }

    public void setFormato(String formato){
        this.formato = formato;
    }
    public void setDigital(boolean digital){
        this.digital = digital;
    }
}
