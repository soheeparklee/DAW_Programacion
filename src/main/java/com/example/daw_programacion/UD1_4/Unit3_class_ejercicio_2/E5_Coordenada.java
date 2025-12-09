package com.example.daw_programacion.UD1_4.Unit3_class_ejercicio_2;

public class E5_Coordenada {
    int x;
    int y;

    public E5_Coordenada() {
    }

    public E5_Coordenada(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public E5_Coordenada sumar(E5_Coordenada c){
        return new E5_Coordenada(this.x + c.x, this.y + c.y);
    }
    public E5_Coordenada restar(E5_Coordenada c){
        return new E5_Coordenada(this.x - c.x, this.y - c.y);
    }
    public E5_Coordenada movirX(int x){
        return new E5_Coordenada(this.x + x, this.y);
    }
    public E5_Coordenada movirY(int y){
        return new E5_Coordenada(this.x, this.y + y);
    }
}
