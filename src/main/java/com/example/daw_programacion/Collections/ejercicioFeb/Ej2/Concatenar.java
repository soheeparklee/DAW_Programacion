package com.example.daw_programacion.Collections.ejercicioFeb.Ej2;

public class Concatenar implements Operacion<String>{
    @Override
    public String calcular(String a, String b) {
        return a.concat(b);
    }
}
