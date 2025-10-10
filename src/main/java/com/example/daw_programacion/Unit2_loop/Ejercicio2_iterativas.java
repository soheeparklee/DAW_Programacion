package com.example.daw_programacion.Unit2_loop;

import java.util.Scanner;

public class Ejercicio2_iterativas {
    public static void main(String[] args) {
        //12. Dibuhar figuras

         for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //12. Modifique el código para que sea el usuario el que decida el número filas que tendrá el triángulo.

/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Put a number: ");
        int input = sc.nextInt();

        for(int i=1; i<=input; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
*/

        //12. 💛 Ingrese el número de filas para la pirámide hueca: full triangulo 5
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Put a number: ");
        int input = sc.nextInt();

        for(int i=1; i<=input; i++){
            for(int j=input; j>= i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
*/

        //12. Ingrese el número de filas para la pirámide hueca: 정삼각형 triangulo pequeño vacio 5
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Put a number: ");
        int input = sc.nextInt();

        for(int i=1; i<=input; i++){
            for(int j=input; j>=i; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=1; k<= i*2-1; k++){
                if(i != input){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            if(i != 1 ){
                System.out.print("*");
            }
            System.out.println();
        }
*/

        //12. Triangulo mas largo 이등변삼각형

/*
        for(int i=1; i<=5; i++){
            for(int j=3; j>i; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=i+1; k<= i*2-1; k++){
                if(i != 5){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            if(i != 1 ){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
*/
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Put a number: ");
        int input = sc.nextInt();
        for(int i=0; i<input; i++){
            for(int j=input; j>i/2; j--){
                System.out.print("a");
            }
            System.out.print("*");
            for(int k=0; k<i; k++){
                System.out.print("b");
            }
            if( i != 0){
                System.out.print("*");
            }

            System.out.println();
            System.out.println();
        }

*/


        //11. Generar tabla de multiplicar
        //Solution_1. using while(true)
/*
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Que tabla de multiplicar quieres?: ");
            int input = sc.nextInt();
            System.out.println("------------");

            for(int i=0; i<11; i++){
                System.out.println(input + " * " + i + " = " + input*i);

            }
            System.out.println("------------");
            System.out.println("Quieres generar otra tabla? (s/n)");
            char respuesto = sc.next().charAt(0);
            if(respuesta == 's'){
                continue;
            }else if (respuesta == 'n'){
                System.out.println("Hasta Luego! ");
                break;
            }
        }
*/
        //Solution_2. using do-while
/*
        Scanner sc = new Scanner(System.in);
        char respuesta;

        do{
            System.out.println("Que tabla de multiplicar quieres?: ");
            int input = sc.nextInt();
            System.out.println("------------");

            for(int i=0; i<11; i++){
                System.out.println(input + " * " + i + " = " + input*i);

            }
            System.out.println("------------");
            System.out.println("Quieres generar otra tabla? (s/n)");
            respuesta = sc.next().charAt(0);


        }while(respuesta == 's' );

        System.out.println("Hasta Luego! ");
*/


        //10. Verificar contraseña.
/*        Scanner sc = new Scanner(System.in);
        char contraseña;
        char respuesta;

        do{
            System.out.println("Log in con contraseña: ");
            contraseña = sc.next().charAt(0);

            System.out.println("Quieres salir? (s/n)");
            respuesta = sc.next().charAt(0);
            if(respuesta == 's'){
                System.out.println("Hasta Luego! ");
                break;
            }

        }while(contraseña != 'a');
*/

        //🙃9. Cuenta números
        //con do-while
/*
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.println("Ingresa un número entero positivo mayor que 500");
            input = sc.nextInt();

            if(input > 500){
                System.out.println("-----------");
                for(int i=0; i<=input; i+=20){
                    System.out.println(i);
                }
                System.out.println("-----------");
            }

        }while(input <= 500);
*/

        //con solo while(true) y continue
/*        Scanner sc = new Scanner(System.in);
        int input;

        while(true){
            System.out.println("Ingresa un número entero positivo mayor que 500");
            input = sc.nextInt();

            if(input <= 500){
                System.out.println("Por favor, MAYOR que 500. ");
                continue;
            }

            System.out.println("-----------");
            for(int i=0; i<=input; i+=20){
                System.out.println(i);
            }
            System.out.println("-----------");
        }
*/

        //con modificición
/*
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.println("Ingresas un número entero positivo mayor que 500");
            input = sc.nextInt();

            if(input > 500){
                System.out.println("Elija el intervalo en el que deseas contar (por ejemplo: 5/10/20)");
                int intervalo = sc.nextInt();

                System.out.println("-----------");
                for(int i=0; i<=input; i+=intervalo){
                    System.out.println(i);
                }
                System.out.println("-----------");
            }

        }while(input <= 500);
*/

        //8. Cuenta dígitos
        //can be 2 solutions to getting length of number
        // (1) change int to String
        // (2) use while loop
/*
        Scanner sc = new Scanner(System.in);
        int input;
        int count=1;
        //int result=0;

        do{
            System.out.println("Ingrea un número: ");
            input = sc.nextInt();
            if(input > 0){

                //result = String.valueOf(input).length(); //(1)

                while(input > 9){ //(2)
                    input = input / 10;
                    count++;
                }
            }
        }while( input <= 0 );

        System.out.println("Tu numero tiene " + count + " digito/digitos.");
        //System.out.println("Tu numero tiene " + result + " digito/digitos.");
*/

        //7. Suma de números.
/*
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = 0;

        for(int i=1; i<= input; i++){
            result += i;
        }

        System.out.println(result);
*/
        //6. Adivina el número con límite de intentos

/*
        Scanner sc = new Scanner(System.in);
        int miNumero = 20;
        int input;
        int intento = 0;

        do{
            System.out.println("Adivina un número entre 1 y 50!: ");
             input = sc.nextInt();

             if(input > miNumero){
                 System.out.println("El número es menor que tu aporte. ");
             }else if(input < miNumero){
                 System.out.println("El número es mayor que tu aporte. ");
             }
             intento++;

             if(intento == 5){
                 System.out.println("Acaba tus intentos. ");
                 break;
             }
        }while(input != miNumero);

        System.out.println("Terminamos. ");
*/

        //5. Contador de números positivos.

/*        Scanner sc = new Scanner(System.in);
        int input;
        int count = 0;

        do{
            System.out.println("Ingresa un número: ");
            input = sc.nextInt();

            if(input < 0){
                System.out.println("Your input has to be a positive number");
                break;
            }

            count++;

        }while(input > 0);


        System.out.println("El escrutinio de los números positivos: " + count);
        */

        //4. Mostrar números en orden ascendente y descendente
        //4-1. for
/*        System.out.println("------ for -----");
        for(int i=1; i<11; i++){
            System.out.println(i);
        }
        for(int i=10; i>0; i--){
            System.out.println(i);
        }
        //4-2. while
        System.out.println("------ while -----");
        int i = 1;
        while(i<11){
            System.out.println(i);
            i++;
        }
        int j = 10;
        while(j>0){
            System.out.println(j);
            j--;
        }
        //4-3. do while
        System.out.println("------ do while -----");
        int k = 1;
        do{
            System.out.println(k);
            k++;
        }while(k<11);
        int l = 10;
        do{
            System.out.println(l);
            l--;
        }while(l>0);
        */

    }
}
