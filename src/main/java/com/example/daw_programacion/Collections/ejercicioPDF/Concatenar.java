package com.example.daw_programacion.Collections.ejercicioPDF;

public class Concatenar implements Operacion<String>{
    private int num1;
    private int num2;

    @Override
    public String calcular(String first, String second) {
        return first.concat(second);
    }
}
