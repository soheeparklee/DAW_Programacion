package com.example.daw_programacion.UD1_4.Unit3_class_ejercicio_2;

public class E6_Reloj {
    int hora;
    int minuto;
    int segundo;
    boolean formato; //true: 24 false: 12

    public E6_Reloj() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
        this.formato = true;
    }

    public E6_Reloj(int hora, int minuto, int segundo, boolean formato) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.formato = formato;
    }
    public void setHora(int hora, int minuto, int segundo){
        if(hora <= 24) this.hora = hora;
        if(minuto <= 60) this.minuto = minuto;
        if(segundo <= 60) this.segundo = segundo;
    }
    public void cambiarFormato(){
        if(this.formato == true){
            this.formato = false;
            if(this.hora > 12) this.hora -= 12;
        }
        if(this.formato == false){
            this.formato = true;
        }
    }

    public String mostrarHora() {
        return "E6_Reloj{" +
                "formato=" + formato +
                ", hora=" + hora +
                ", minuto=" + minuto +
                ", segundo=" + segundo +
                '}';
    }
}
