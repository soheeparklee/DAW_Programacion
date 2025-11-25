package com.example.daw_programacion.Test_Cine;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Cine cineCartoon = new Cine("cartoon", 1, "SuperCharlie", LocalTime.of(13, 30), 10, 8);

        Scanner sc = new Scanner(System.in);
        int fila;
        int columna;

        do{
            System.out.println("----------------Monstra el cine----------------");
            System.out.println("!!! False significa no esta ocupado, True significa esta ocupado !!!");
            for(int i = 0; i < cineCartoon.getEstrucuraM() ; i++) {
                for(int j = 0; j < cineCartoon.getEstrucuraM(); j++) {
                    System.out.print(cineCartoon.getEstrucura()[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("------------------------------------------------");

            System.out.println("Quieres reservar? Fila: ");
            fila = sc.nextInt();
            System.out.println("Columna: ");
            columna = sc.nextInt();

            if(cineCartoon.reservarAsiento(fila, columna)){
                System.out.println("Ha podido reservar.");
            }else{
                System.out.println("No podido reservar. Ya estaba ocupada.");

            }

        }while(fila != 0 && columna != 0);



    }
}
