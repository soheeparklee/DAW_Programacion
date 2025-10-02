package com.example.daw_programacion;

import java.util.Scanner;

public class Ejercicio2_estructuras {
    public static void main(String[] args) {
        //Estructura if
/*
        int n = 6;
        if(n ==1){
            System.out.println("This is monday");
        }else if(n ==2){
            System.out.println("This is tuesday");
        }else if(n ==3){
            System.out.println("This is wed");
        }else if(n ==4){
            System.out.println("This is thu");
        }else if(n ==5){
            System.out.println("This is fri");
        }else{
            System.out.println("This is fin de semana");
        }
*/

        //1. Ejecutar
/*        int x=0;
        int n = 16;
        while (n % 2 == 0) {
            x = x+2;
            n = n/2;
        }

        System.out.println(x); //8
*/

        //2. Cuántas veces se ejecuta? 50 veces
 /*       int a = 9;
        int i = 0;
        while(i < 100){
            if((a%4 == 0) || (i%2 == 0)){
                System.out.println("a: " + a + ", i: " + i);
            }
            i++;
        }
*/
        //3. Número de suerte
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Pone tu fecha de nacimiento ddmmyyyy");
        String fecha = sc.nextLine();
        Integer dia = Integer.parseInt(fecha.substring(0, 2));
        Integer mes = Integer.parseInt(fecha.substring(2, 4));
        Integer ano = Integer.parseInt(fecha.substring(4, 8));

        Integer sum = dia + mes + ano;

        int a;
        int b;
        int c;
        int d;
        if(sum >= 10){
            if(sum >= 1000){
                a = sum / 1000;
                b = (sum - a*1000) / 100;
                c = (sum - a*1000 - b*100) / 10;
                d = sum % 10;
                sum = a + b + c + d;
            }else if(sum >= 100){
                a = sum / 100;
                b = (sum - a * 100) /10;
                c = sum % 10;
                sum = a + b + c;
            }
            else if(sum >= 10){
                a = sum / 10;
                b = sum % 10;
                sum = a + b;
            }
        }

        System.out.println("Tu núermo suerte es: " + sum);

*/
        //4. Multiplica 1 al 10
/*
        for (int i=1; i<11; i++){
            for(int j=1; j<11; j++){
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println("-----------");
        }
*/
        //5. Solo muestre los primeros 5 número
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Pone mas the 5 números: ");
        String input = sc.nextLine();
        System.out.println("Solo los 5 primeros números: " + input.substring(0, 5));
*/
        //6. Números del 1 al 20 que no sean múltiplos de 5
/*
        for(int i=1; i<21; i++){
            if(i%5 != 0){
                System.out.println(i);
            }
        }
*/
        //7. Lea un número y devuela binaria
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Input decimal number: ");
        int decimal = sc.nextInt();
        StringBuffer binary = new StringBuffer();


        while(decimal >= 2){
            if(decimal % 2 == 0){
                binary.append("0");
                decimal /= 2;
            }else{
                binary.append("1");
                decimal /= 2;
            }
        }
        binary.append(decimal);

        while(decimal > 0){
            binary.append(decimal % 2);
            decimal /= 2;
        }
        binary.reverse();
        System.out.println("binary: "+ binary);
*/

        //8. Transforma for en while
/*        int i = 5;
        while(i<15){
            System.out.println(i);
            i++;
        }
        */

        //9. Pedir al usuario cinco cadenas de texto y generar una sola cadena uniéndolas todas
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Te pido cinco cadenas de texto: ");
        String primero = sc.nextLine();
        String segundo = sc.nextLine();
        String trecero = sc.nextLine();
        String quarto = sc.nextLine();
        String quinto = sc.nextLine();

        System.out.println(primero + segundo + trecero + quarto + quinto);
*/
        //10. Se deja pedir cuando la cantidad supera el valor 50
/*
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while( i < 50){
            System.out.println("Te pido un numero: ");
            int input = sc.nextInt();
            i += input;
            if( i > 50) {
                System.out.println("La suma supera el valor 50. Suma: " + i);
                break;
            }
            System.out.println("Suma: " + i);
        }
*/
        //11. Escribir *
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero a entre el 1 y el 10: ");
        int a = sc.nextInt();
        System.out.println("Numero b entre el 1 y el 10: ");
        int b = sc.nextInt();

        while( a != b ){
            if(a < b){
                System.out.println("*");
                a++;
            }else if(b < a){
                System.out.println("*");
                b++;
            }
        }
        System.out.println("No mas ");

*/

        //12.
        Scanner sc = new Scanner(System.in);
        float medio;
        int sum = 0;
        int count = 0;
        boolean bool = true;
        int input;

        while (bool){
            do {
                System.out.println("Numero entre el 1 y el 10: ");
                input = sc.nextInt();

                if (input == 0) {
                    System.out.println("Has puesto 0. Fin de la captura de datos.");

                    char deseo;
                    do {
                        System.out.println("Deseas una nueva ejecución? Solo acepta 's' o 'n'");
                        deseo = sc.next().toLowerCase().charAt(0);
                        if (deseo == 's') {
                            System.out.println("Hacemos una nueva ejecuión. ");
                            break;
                        } else if (deseo == 'n') {
                            System.out.println("Terminamos.");
                            break;
                        }
                    } while (deseo != 's' && deseo != 'n');

                    bool = false;
                    break;
                }

                if (input > 10 || input < 0) {
                    System.out.println("No! Solo numero entre el 1 y el 10! ");
                    break;
                }

                sum += input;
                count++;
                medio = (float) sum / count;
                System.out.println("medio: " + medio);

            } while (input <= 10 && input >= 1);
        }
    }
}
