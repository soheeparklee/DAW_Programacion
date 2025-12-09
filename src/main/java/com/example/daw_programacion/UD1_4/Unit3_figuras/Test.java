package com.example.daw_programacion.UD1_4.Unit3_figuras;


import com.example.daw_programacion.UD1_4.Unit3_figuras.Figuras.Circunferencia;
import com.example.daw_programacion.UD1_4.Unit3_figuras.Figuras.Cuadrado;
import com.example.daw_programacion.UD1_4.Unit3_figuras.Figuras.Triangulo;

public class Test
{
    public static void main (String [] args)
    {
        Triangulo t1 = new Triangulo(100,50,70,90);
        Triangulo t2 = new Triangulo(34,5,10,6);
        Triangulo t3 = new Triangulo(200,45,40,32);
        Cuadrado cua1 = new Cuadrado(4.2);
        Circunferencia cir1 = new Circunferencia(4.8);
        Circunferencia cir2 = new Circunferencia(1.5);
        Triangulo tri1 = new Triangulo(8,15,12,10);
        
        System.out.println("El área de la figura completa es " + (tri1.getArea() + cir1.getArea()/2 +
        3/4*cir2.getArea() + cua1.getArea() ));
        
        double perimetroTotal = tri1.getPerimetro() + cua1.getPerimetro() - (cua1.getLado()) +
        (0.5*cir1.getPerimetro()) - (2*cir1.getRadio()) + (0.75*cir2.getPerimetro()) -
        (2*cir1.getRadio()) + (0.75*cir2.getPerimetro()) - (2*(cir2.getRadio()));
        
        System.out.println("el perímetro total es: " + perimetroTotal);
        
        
        
       
        
    }
}

