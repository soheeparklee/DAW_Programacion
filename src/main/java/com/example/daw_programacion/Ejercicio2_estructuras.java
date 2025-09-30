package com.example.daw_programacion;

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



    }
}
