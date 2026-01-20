package com.example.daw_programacion.Collections.Extra;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        Comparator<String> comp1 = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int lengthCompare = Integer.compare(s1.length(), s2.length());
                return (lengthCompare != 0) ? lengthCompare : s1.compareTo(s2);
            }
        };

        Comparator<String> comp2 = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                 int c =  Character.compare(s1.charAt(0), s2.charAt(0));
                return (c != 0) ? c : s1.compareTo(s2);
            }
        };

        TreeSet<String> ts = new TreeSet<>(comp2);

        ts.add("ddgdgdgdfg");
        ts.add("bwrfewgr");
        ts.add("afng");
        ts.add("c");

        System.out.println(ts);
    }
}
