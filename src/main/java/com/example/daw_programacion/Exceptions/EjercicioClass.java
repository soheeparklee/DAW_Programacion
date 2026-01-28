package com.example.daw_programacion.Exceptions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EjercicioClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerador = 0, denumerador = 0, result = 0, pos = 0;
        int[] array = new int[4];

        try{
            System.out.println("Introduce el numerador: ");
            numerador = Integer.parseInt(sc.nextLine());
            System.out.println("Introduce el denumerador: ");
            denumerador = Integer.parseInt(sc.nextLine());
            result = numerador / denumerador;
            System.out.println("Posicion: ");
            pos = Integer.parseInt(sc.nextLine());
            array[pos] = result;
            System.out.println("result: " + array[pos]);
        }catch(NumberFormatException e){
            System.out.println("Error producido por convertir algo que no es entero a un entero-> " + e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("Error producido por dividir entre 0-> " + e.getMessage());
        }catch(IndexOutOfBoundsException e){
            System.out.println("Error producido por index no existe-> " + e.getMessage());
        }
        sc.close();

        //this code can have problem when denumerador = 0
    }
}
