package com.example.daw_programacion.OOP.Ejercicio_5.Ej8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PDF pdf1 = new PDF("Informe anual 2023");
        PDF pdf2 = new PDF("Informe anual 2024");
        PDF pdf3 = new PDF("Informe anual 2024");

        Compra compra1 = new Compra("Nintendo", 199);
        Compra compra2 = new Compra("Sofa", 499);
        Compra compra3 = new Compra("Zapatos", 39);

        Factura factura = new Factura();
        factura.getCompraList().add(compra1);
        factura.getCompraList().add(compra2);
        factura.getCompraList().add(compra3);

        List<Imprimible> printableList = new ArrayList<>();
        printableList.add(pdf1);
        printableList.add(pdf2);
        printableList.add(pdf3);
        printableList.add(factura);

        for (Imprimible imprimible : printableList) {
            if(imprimible instanceof PDF){
                imprimible.imprimir();
            }else if(imprimible instanceof Factura){
                imprimible.imprimir();
            }
        }







    }
}
