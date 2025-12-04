package com.example.daw_programacion.UD1_4.Unit3_figuras.Figuras;


public class Cuadrado
{
    private double lado;
    
    public Cuadrado(double lado)
    {
        this.lado = lado;
    }
    
    public void setLado(double lado)
    {
        this.lado = lado;
    }
    
    public double getLado()
    {
        return lado;
    }
    
    public double getPerimetro()
    {
        return 4*lado;
    }
    
     public double getArea()
    {
        return lado*lado;
    }
    
}