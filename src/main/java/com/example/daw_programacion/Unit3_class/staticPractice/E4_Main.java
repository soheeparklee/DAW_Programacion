package com.example.daw_programacion.Unit3_class.staticPractice;

public class E4_Main {
    public static void main(String[] args) {
        E4_Ordenador o1 = new E4_Ordenador("one", "DAW");
        System.out.println(o1.getType()); //DAW
        //in constructor type was set to WOO
        //but main class constrctor changed type to DAW
        E4_Ordenador o2 = new E4_Ordenador("one", "WAD");
        System.out.println(o1.getType()); //WAD
        //static is shared among variables
        //so if we change o2 type, would also change the value of o1 type
    }
}
