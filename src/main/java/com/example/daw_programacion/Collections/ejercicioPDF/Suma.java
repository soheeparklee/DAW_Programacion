package com.example.daw_programacion.Collections.ejercicioPDF;

public class Suma implements Operacion<Integer>{
    private int num1;
    private int num2;

    @Override
    public Integer calcular(Integer num1, Integer num2) {
        return num1 + num2;
    }
}
