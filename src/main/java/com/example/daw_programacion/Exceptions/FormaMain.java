package com.example.daw_programacion.Exceptions;

import java.util.Scanner;

public class FormaMain {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();
        double area = calcularArea(triangulo);
        System.out.println("area: " + area);
        System.out.println(triangulo);

    }
    public static double calcularArea(Triangulo triangulo){
        Scanner sc = new Scanner(System.in);
        double base = 0, altura = 0;

        try{
            System.out.println("Introduce base: ");
            base = Double.parseDouble(sc.nextLine());

            System.out.println("Introduce altura: ");
            altura = Double.parseDouble(sc.nextLine());
//            triangulo.setBase(base);
//            triangulo.setAltura(altura);
//            sc.close();
//            return triangulo.getAltura() * triangulo.getBase() / 2;
        }catch(NumberFormatException e){
            base = 1;
            altura = 1;
//            triangulo.setBase(base);
//            triangulo.setAltura(altura);
//            sc.close();
//            return triangulo.getAltura() * triangulo.getBase() / 2;
        }finally{
            triangulo.setBase(base);
            triangulo.setAltura(altura);
            sc.close();
            return triangulo.getAltura() * triangulo.getBase() / 2;
        }
    }
}
