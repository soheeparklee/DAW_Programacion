package com.example.daw_programacion.UD1_4.Unit3_class_ejercicio_2;

public class E9_Fraccion {
    private int num;
    private int den;

    public E9_Fraccion(){
        this.num = 0;
        this.den = 1;
    }
    public E9_Fraccion(int num){
        this.num = num;
        this.den = 1;
    }

    public E9_Fraccion(int num, int den){
        this.num = num;
        this.den = den;
    }


    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public E9_Fraccion sumar(E9_Fraccion f){
        int denResult = this.den * f.den;
        int numResult = this.den * f.num + this.num * f.den;
        E9_Fraccion result = new E9_Fraccion(numResult, denResult);
        return result;
    }
    public E9_Fraccion restar(E9_Fraccion f){
        int denResult = this.den * f.den;
        int numResult =  this.num * f.den - this.den * f.num;
        E9_Fraccion result = new E9_Fraccion(numResult, denResult);
        return result;
    }
    public E9_Fraccion multiplicar(E9_Fraccion f){
        int denResult = this.den * f.den;
        int numResult =  this.num * f.num;
        E9_Fraccion result = new E9_Fraccion(numResult, denResult);
        return result;
    }
    public E9_Fraccion dividir(E9_Fraccion f){
        int denResult = this.den * f.num;
        int numResult =  this.num * f.den;
        E9_Fraccion result = new E9_Fraccion(numResult, denResult);
        return result;
    }
    public void monstrar(){
        System.out.println(this.num + " " + this.den);
    }



}
