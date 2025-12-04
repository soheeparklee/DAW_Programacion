package com.example.daw_programacion.UD1_4.Unit4_String;

public class StringTest2 {
    public static void main(String[] args) {
        String cad1 = "ABCDE10";

        System.out.println(cad1.indexOf(10));
        System.out.println(cad1.indexOf('C')); //2


        String cad2 = "BBB";

        boolean bool1 = cad1.equals(cad2);
        boolean bool2 = (cad1 == cad2);

        System.out.println(bool1);
        System.out.println(bool2);

        int test = Integer.parseInt("123"); //123
        double test1 = Double.parseDouble("123.45"); //123.45
        System.out.println(test); //123
        System.out.println(test1);

        int test2 = Integer.valueOf("123"); //123
        double test3 = Double.valueOf("123.45");  //123.45
        System.out.println(test2);
        System.out.println(test3);

        String cadena = "SO;HEE;PARK;LEE";
        String[] fullname = cadena.split(";");
        for (String s : fullname) {
            System.out.println(s);
        }

//        SO
//        HEE
//        PARK
//        LEE

    }
}
