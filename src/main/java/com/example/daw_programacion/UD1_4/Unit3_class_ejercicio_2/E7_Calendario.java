package com.example.daw_programacion.UD1_4.Unit3_class_ejercicio_2;

public class E7_Calendario {
    private int año;
    private int mes;
    private int dia;

    public E7_Calendario(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAño() {
        return año;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void incrementarDia(){
        if(this.dia <= 30)  this.dia +=1;
    }
    public void incrementarMes(){
        if(this.mes <= 12)  this.mes +=1;
    }
    public void incrementarAño(int cantidad){
        if(cantidad != 0)  this.año += cantidad;
    }
    public void mostrar(){
        System.out.println(dia + "/" + mes+ "/" + año);
    }
    public boolean iguales(E7_Calendario otraFecha){
        if(this.dia == otraFecha.dia && this.mes == otraFecha.mes && this.año == otraFecha.año) return true;
        else return false;
    }
}
