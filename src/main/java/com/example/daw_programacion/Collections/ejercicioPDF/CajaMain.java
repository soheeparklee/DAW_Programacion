package com.example.daw_programacion.Collections.ejercicioPDF;

import java.util.ArrayList;

public class CajaMain {
    public static void main(String[] args) {
        String password = "12345";
        Caja caja1 = new Caja<>("box one", password);

        int count = 5;
        Caja caja2 = new Caja("box two", count);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Caja caja3 = new Caja("box three", list);

        caja3.printContent(caja3.getContent());
    }
}
