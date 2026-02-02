package com.example.daw_programacion.OOP.Ejercicio_5.Ej8;

public class PDF implements Imprimible{
    private String texto;

    public PDF(String texto) {
        this.texto = texto;
    }

    @Override
    public void imprimir() {
        System.out.println("++++++++Generando PDF con contenido++++++++");
        System.out.println(texto);
    }
}
