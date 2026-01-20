package com.example.daw_programacion.Collections.Extra;

import java.util.Comparator;

public class TreeComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        int lengthCompare = Integer.compare(s1.length(), s2.length());
        return (lengthCompare != 0) ? lengthCompare : s1.compareTo(s2);
    }
}
