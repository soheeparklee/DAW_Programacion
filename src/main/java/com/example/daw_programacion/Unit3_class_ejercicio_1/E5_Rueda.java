package com.example.daw_programacion.Unit3_class_ejercicio_1;

public class E5_Rueda {
    private String tipo;
    private double grosor; //thickness
    private double diametro;
    private String marca;

    public E5_Rueda(){
        this.tipo = "tipoA";
        this.grosor = 5.0;
        this.diametro = 100.0;
        this.marca = "marcaA";
    }

    public String getTipo(){
        return this.tipo;
    }

    public double getGrosor(){
        return this.grosor;
    }
    public double getDiametro(){
        return this.diametro;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setGrosor(double grosor){
        this.grosor = grosor;
    }
    public void setDiametro(double diametro){
        this.diametro = diametro;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void comprobarDimensiones(){
        if(this.diametro > 1.4){
            System.out.println("La rueda es para un vehículo grande. ");
            if(this.grosor <0.4){
                System.out.println("El grosor para esta rueda es inferior al recomendado");
            }
        }else if(this.diametro<= 1.4 && this.diametro > 0.8){
            System.out.println("La rueda es para un vehículo mediano. ");
            if(this.grosor < 0.25){
                System.out.println("El grosor para esta rueda es inferior al recomendado");
            }
        }else{
            System.out.println("La rueda es para un vehículo pequeño. ");
        }
    }

    public static void main(String[] args) {
        E5_Rueda rueda = new E5_Rueda();
        rueda.comprobarDimensiones();

        rueda.setDiametro(1.0);
        rueda.setGrosor(0.1);
        rueda.comprobarDimensiones();

    }
}


