package com.example.daw_programacion.Collections.ejercicio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ejercicio56 {
    public static void main(String[] args) {
        HashMap <String, String> map = new HashMap<>();
        map.put("489392490", "12345D");
        map.put("345534590", "FSDOFA");
        map.put("24355546", "DFNKDLA");
        map.put("3453984059", "345G");
        map.put("2347876", "GDFBQ");
        map.put("9028348249", "12345D");

//        for (String s : map.keySet()) {
//            if(s.equals("3453984059")){
//                System.out.println(map.get(s));
//            }
//        }

        Set<String> strings = map.keySet();
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }

    }
}
