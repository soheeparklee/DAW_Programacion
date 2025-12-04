package com.example.daw_programacion.UD1_4.Test_Practice_2;

import java.util.Arrays;

/*
* Esta clase sala es para guardar información de una sala en un cine.
* Tiene metodo reservarAsiento
* @ author So Hee Park
* @ version version 1
* */
public class Sala {
    private String nombre;
    private int número;
    private String película;
    private int sesión;
    private int fila;
    private int columna;
    private boolean estructura[][];

    public Sala(String nombre, int número, String película, int sesión, int fila, int columna) {
        this.nombre = nombre;
        this.número = número;
        this.película = película;
        this.sesión = sesión;
        this.fila = fila;
        this.columna = columna;
        this.estructura = new boolean[fila][columna];
    }

    public String getNombre() {
        return nombre;
    }

    public int getNúmero() {
        return número;
    }

    public String getPelícula() {
        return película;
    }

    public int getSesión() {
        return sesión;
    }

    public boolean[][] getEstructura() {
        return estructura;
    }


    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNúmero(int número) {
        this.número = número;
    }

    public void setPelícula(String película) {
        this.película = película;
    }

    public void setSesión(int sesión) {
        this.sesión = sesión;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "nombre='" + nombre + '\'' +
                ", número=" + número +
                ", película='" + película + '\'' +
                ", sesión=" + sesión +
                ", estructura=" + Arrays.toString(estructura) +
                '}';
    }

    /*
    * Este metodo confirma si el asiento que el usuario ha pedido puede reservar o no.
    * @param int fila, row de estructura
    * @param int columna, column de estructura
    * @return si el asiento esta reservado o no
    * */
    public boolean reservarAsiento (int fila, int columna){
        if(this.estructura[fila][columna] == true){
            return false;
        }else{
            this.estructura[fila][columna] = true;
            return true;
        }
    }
}
