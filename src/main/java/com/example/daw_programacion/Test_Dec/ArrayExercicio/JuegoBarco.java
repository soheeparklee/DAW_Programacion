package com.example.daw_programacion.Test_Dec.ArrayExercicio;

import java.util.Arrays;

public class JuegoBarco {
    public char[][] tablero = new char[8][8];

    public char[][] getTablero() {
        return tablero;
    }

    public char getTableroData(int i, int j){
        return this.tablero[i][j];
    }

    public JuegoBarco() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = 'o';
            }
        }
    }

    public String monstar() {
        StringBuilder result = new StringBuilder();
        for (char[] row : tablero) {
            for (char val : row) {
                result.append(val);
            }
            result.append('\n');
        }
        return result.toString();
    }

    public void colocarBarcos(int tamaño, char o){

    }


}
