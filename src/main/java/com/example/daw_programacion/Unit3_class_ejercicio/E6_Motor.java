package com.example.daw_programacion.Unit3_class_ejercicio;

public class E6_Motor {
    private int tipoBomba;
    private String tipoFluido;
    private String combustible; //fuel

    public E6_Motor(){
        this.tipoBomba = 10;
        this.tipoFluido = "tipoA";
        this.combustible = "combustibleA";
    }

    public int getTipoBomba() {
        return tipoBomba;
    }

    public String getTipoFluido() {
        return tipoFluido;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setTipoBomba(int tipoBomba) {
        this.tipoBomba = tipoBomba;
    }

    public void setTipoFluido(String tipoFluido) {
        this.tipoFluido = tipoFluido;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void dimeTipoMotor(){
        switch (this.tipoBomba) {
            case 0:
                System.out.println("No hay establecido un valor definido para el tipo de bomba");
                break;
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor válido para tipo de bomba");
        }
    }

}
