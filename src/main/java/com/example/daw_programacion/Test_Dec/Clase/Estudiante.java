package com.example.daw_programacion.Test_Dec.Clase;

import java.util.Arrays;

public class Estudiante {
    private String[] nombres;

    public Estudiante(String[] nombres) {
        this.nombres = nombres;
    }

    public String[] getNombres() {
        return nombres;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombres=" + Arrays.toString(nombres) +
                '}';
    }


}
