package com.example.daw_programacion.Unit3_class_ejercicio_1;

public class E7_MotorAñadido {
    private int tipoBomba;
    private String tipoFluido;
    private String combustible; //fuel

    private boolean motorEsParaAgua;

    public E7_MotorAñadido(){
        this.tipoBomba = 10;
        this.tipoFluido = "tipoA";
        this.combustible = "combustibleA";
        this.motorEsParaAgua = false;
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

    public void setMotorEsParaAgua(int num){
        if(num == 1){
            this.motorEsParaAgua = true;
        }else{
            this.motorEsParaAgua = false;
        }
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

    public boolean dimeSiMotorEsParaAgua(int num){
        setMotorEsParaAgua(num);
        return this.motorEsParaAgua;
    }

}
