package com.example.daw_programacion.UD1_4.Test_Dec.ArrayExercicio;

import java.util.Random;

public class Hotel {
    private float [][][] hotelArr = new float[10][5][5];

    //asginar temperatura
    //💡18~27사이의 소수 2자리 수 random
    //💡Math.random()
    public void asignar(){
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    float value = random.nextFloat(9) + 18;
                    hotelArr[i][j][k] = Math.round(value * 100f) / 100f;
                }
            }
        }
    }

    public void monstar(){
        for (float[][] ints : hotelArr) {
            for (float[] anInt : ints) {
                for (float v : anInt) {
                    System.out.println(v);
                }
                System.out.println("-----");
            }
            System.out.println("----------");
        }
    }

    //más caliente y más fria
    int minI;
    int minJ;
    int minK;
    float minValue = Float.MAX_VALUE;
    int maxI;
    int maxJ;
    int maxK;
    float maxValue = Float.MIN_VALUE;

    public String masFrioCaliente(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    if(hotelArr[i][j][k] < minValue){
                        minValue = hotelArr[i][j][k];
                        minI = i;
                        minJ = j;
                        minK = k;
                    }
                    if(hotelArr[i][j][k] > maxValue){
                        maxValue = hotelArr[i][j][k];
                        maxI = i;
                        maxJ = j;
                        maxK = k;
                    }
                }
            }
        }
        //💡소수 2자리까지만 출력, printf %.2f
        return String.format("La habitación más caliente está en Planta %d, Profundidad %d, Posición Horizontal %d con %.2f grados. \nLa habitación más fría está en Planta %d, Profundidad %d, Posición Horizontal %d con %.2f grados.", maxI, maxJ, maxK, maxValue, minI, minJ, minK, minValue);
    }

    //calcular el promedio
    //💡소수 2자리까지만 출력, printf %.2f
    public String calcular(int planta){
        float sum = 0;
        float result = 0;
        for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    sum += hotelArr[planta][j][k];
                }
            }
        result = (float) Math.round(sum / 25 * 100) /100;
        return String.format("Promedio de temperatura para la planta %d:  %.2f grados.", planta, result);
    }
}
