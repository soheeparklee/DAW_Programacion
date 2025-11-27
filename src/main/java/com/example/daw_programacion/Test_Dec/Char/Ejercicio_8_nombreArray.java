package com.example.daw_programacion.Test_Dec.Char;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_8_nombreArray {
    //⚠️method로 따로 빼기?
    //8. menú de nombres
    private String[] nombreArr = new String[5];
    static int count = 0;


    public void introducirNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre: ");
        String input = sc.nextLine();

        boolean found = false;

        for (String nombre : this.nombreArr) {
            if (input.equals(nombre)) found = true;
        }

        if (!found) {
            this.nombreArr[count] = input;
            count++;
        }
    }

    public String listarNombres() {
        return Arrays.toString(nombreArr);
    }
    public void eliminarNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre para eliminar: ");
        String input = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if(nombreArr[i].equals(input)){
                nombreArr[i] = null;
                count--;
            }
        }
    }

    public void eliminarTodoNombres(){
        nombreArr = new String[5];
    }
}
