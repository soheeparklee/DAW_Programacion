package com.example.daw_programacion.OOP.Ejercicio_3.version2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Contrato> {


    @Override
    public int compare(Contrato c1, Contrato c2) {
        //return Integer.compare(c1.getSalario(), c2.getSalario());
        return c1.getSalario() > c2.getSalario() ? 1 : (c1.getSalario() == c2.getSalario()) ? 0 : -1;
    }
}
