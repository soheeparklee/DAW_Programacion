package com.example.daw_programacion.UD1_4.Test_Dec.ArrayExercicio;

public class JuegoBarcoJugador {

    char[][] jugador = new char[8][8];
    static int count;

    public JuegoBarcoJugador() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                jugador[i][j] = '-';
            }
        }
    }

    public String monstar() {
        StringBuilder result = new StringBuilder();
        for (char[] row : jugador) {
            for (char val : row) {
                result.append(val);
            }
            result.append('\n');
        }
        return result.toString();
    }

    public String registrarDisparo(JuegoBarco tablero, int row, char col){
        count++;
        int r = row -1;
        int c = Character.valueOf(col)-65;
        if(tablero.getTableroData(r, c) == 'x'){
            this.jugador[r][c] = 'x';
            return "Correcto!";
        } else {
            this.jugador[r][c] = 'o';
            return "Fallo!";
        }
    }
}
