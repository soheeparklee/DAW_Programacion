package com.example.daw_programacion.UD1_4.Unit3_figuras.Figuras;

public class Circunferencia {

 private double radio;
 //private double area;
 //private double perimetro;
 //private final double PI = 3.1416;

 public Circunferencia(double radio) {

 this.radio = radio;
 //this.area = this.PI * this.radio * this.radio;
 //this.perimetro = 2 * this.PI * this.radio;
 }

 public double getRadio() {
     return radio;
 }
 
 public void setRadio(double radio)
 {
     this.radio = radio;   
 }

 public double getArea() {
     return Math.PI * this.radio * this.radio;
 }

 public double getPerimetro() {
     return 2 *  Math.PI * this.radio;
 }
 }