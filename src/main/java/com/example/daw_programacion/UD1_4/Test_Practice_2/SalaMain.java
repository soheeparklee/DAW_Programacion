package com.example.daw_programacion.UD1_4.Test_Practice_2;

import java.util.Scanner;

public class SalaMain {

    public static void monstrarSala(Sala sala){
        boolean[][] estructura = sala.getEstructura();
        System.out.println("------monstrar sala y su reservacion-----");
        for (int i = 0; i < sala.getFila(); i++) {
            for (int j = 0; j < sala.getColumna(); j++) {
                System.out.print(estructura[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sala sala = new Sala("cartoon", 1, "Super Charlie", 13, 10, 8);

        int fila;
        int columna;
        do{
            monstrarSala(sala);

            System.out.println("Pide fila: ");
            fila = sc.nextInt();
            System.out.println("Pide columna: ");
            columna = sc.nextInt();

            if(sala.reservarAsiento(fila, columna)){
                System.out.println("Reserva posible. Reservado con exito!");
            }else{
                System.out.println("No podia reservar, estaba ocupado.");
            }

        }while(fila != 0 && columna != 0);
    }
}
