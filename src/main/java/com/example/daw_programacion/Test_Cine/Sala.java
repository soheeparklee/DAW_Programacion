package com.example.daw_programacion.Test_Cine;

import java.time.LocalTime;
import java.util.Arrays;


/*
* @author So Hee Park
* @version version_1
* this.estrucura[fila][columna] = false significa no esta ocupado
* */

public class Sala {
    private String nombre;
    private int salaNúmero;
    private String película;
    private LocalTime sesión;
    private int estrucuraN;
    private int estrucuraM;
    private boolean[][] estrucura; // default would be false;

    public Sala(String nombre, int salaNúmero, String película, LocalTime sesión, int estrucuraN, int estrucuraM ) {
        this.nombre = nombre;
        this.salaNúmero = salaNúmero;
        this.película = película;
        this.sesión = sesión;
        this.estrucuraN = estrucuraN;
        this.estrucuraM = estrucuraM;
        this.estrucura = new boolean[this.estrucuraN][this.estrucuraM];
    }

    public LocalTime getSesión() {
        return sesión;
    }

    public int getSalaNúmero() {
        return salaNúmero;
    }

    public String getPelícula() {
        return película;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEstrucuraN() {
        return estrucuraN;
    }

    public int getEstrucuraM() {
        return estrucuraM;
    }

    public boolean[][] getEstrucura() {
        return estrucura;
    }

    public void setEstrucura(boolean[][] estrucura) {
        this.estrucura = estrucura;
    }

    public void setEstrucuraM(int estrucuraM) {
        this.estrucuraM = estrucuraM;
    }

    public void setEstrucuraN(int estrucuraN) {
        this.estrucuraN = estrucuraN;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPelícula(String película) {
        this.película = película;
    }

    public void setSalaNúmero(int salaNúmero) {
        this.salaNúmero = salaNúmero;
    }

    public void setSesión(LocalTime sesión) {
        this.sesión = sesión;
    }

    @Override
    public String toString() {
        return "Cine{" +
                "nombre='" + nombre + '\'' +
                ", salaNúmero=" + salaNúmero +
                ", película='" + película + '\'' +
                ", sesión=" + sesión +
                ", estrucuraN=" + estrucuraN +
                ", estrucuraM=" + estrucuraM +
                ", estrucura=" + Arrays.toString(estrucura) +
                '}';
    }

    /*
    * esta metodo es para explica......
    * @param fila es el row
    * @param columna es el column
    * @return boolean si es ocupado
    * this.estrucura[fila][columna] = false significa no esta ocupado
    */
    public boolean reservarAsiento(int fila, int columna){
        boolean reservado = this.estrucura[fila][columna];
        if (!reservado){
            this.estrucura[fila][columna] = true;
            return true; // podido reservar
        }else{
            return false; // ya estaba ocupado
        }
    }
}
