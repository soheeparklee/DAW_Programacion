package com.example.daw_programacion.Unit1_primitive;

import java.util.Scanner;

public class Ejercicio1_10 {
    public static void main(String[] args) {
        //1. Calcular el cuadrado
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número: ");

        float input = sc.nextFloat();
        System.out.println("El cuadrado de " + input + " es: " + input*input);
*/

        //2. Calcular el perímetro
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base del rectángulo: ");
        float base = sc.nextFloat();
        System.out.println("Introduce la altura del rectángulo: ");
        float altura = sc.nextFloat();

        System.out.println("El perímetro del rectángulo es: " + (base+altura)*2);
*/

        //3. Leer datos personales
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce tu apellido: ");
        String apellido = sc.nextLine();
        System.out.println("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Introduce tu nota: ");
        double nota = sc.nextDouble();
        System.out.printf("El alumno %s %s, de %d años, tiene una nota de %.1f", nombre, apellido, edad, nota);
*/

        //4. Intercambiar el valor
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de la primera variable: ");
        int primera = sc.nextInt();
        System.out.println("Introduce el valor de la segunda variable: ");
        int segunda = sc.nextInt();

        int cambioPrimero = segunda;
        segunda = primera;
        System.out.println("Después del intercambio, el valor de la primera variable es: " + cambioPrimero);
        System.out.println("Después del intercambio, el valor de la primera variable es: " + segunda);
*/

        //5. Convertir una velocidad
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la velocidad en km/h: ");
        int velocidad = sc.nextInt();
        double cambidado = velocidad / 3.6;

        System.out.println("La velocidad en m/s es: " + cambidado);
*/

        //6. Dado un número de 3 cifras, mostrar cada una de sus cifras por separado.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de tres cifras: ");
        int num = sc.nextInt();
        int centenas = num / 100;
        int decenas = (num % 100) / 10;
        int unidades = num % 10 % 10;

        System.out.println(centenas + " " + decenas + " " + unidades);

        //7. Invertir un número de 5 dígitos
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número de cinco dígitos: ");
        int num = sc.nextInt();
        StringBuffer invertido =  new StringBuffer();

        for(int i=0; i<5; i++){
            int remainder = num % 10;
            num = num / 10;
            invertido.append(remainder);
        }

        System.out.println("Número invertido:" + invertido);
*/

        //8. Convertir segundos a horas, minutos y segundos
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de segundos: ");
        int input = sc.nextInt();

        int horas = input / 3600;
        int minutos = (input - 3600*horas)/60;
        int segundos = input - 3600*horas - 60*minutos;

        System.out.println(horas + " " + minutos + " " + segundos);
*/

        //9. Mostrar únicamente la parte entera dado un número racional
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce número decimal: ");
        float input = sc.nextFloat();
        int result = (int) input;

        System.out.println("La parte entera es: " + result);
*/
        //10. Calcular el índice de masa corporal (IMC)
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu peso en kilogramos: ");
        int peso = sc.nextInt();
        System.out.println("Introduce tu altura en metros: ");
        float altura = sc.nextFloat();

        float imc = (float) peso / (altura * altura);
        System.out.println("Tu Índice de Masa Corporal (IMC) es: " + imc);



*/

    }
}
