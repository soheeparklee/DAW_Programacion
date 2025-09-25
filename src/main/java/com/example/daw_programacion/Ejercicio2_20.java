package com.example.daw_programacion;
import java.util.Scanner;

public class Ejercicio2_20 {
    public static void main(String[] args) {
        //11. Comparar tres números
/*

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        String numero1 = sc.nextLine();
        System.out.println("Introduce el segundo número: ");
        String numero2 = sc.nextLine();
        System.out.println("Introduce el tercer número: ");
        String numero3 = sc.nextLine();

        Integer n1 = Integer.valueOf(numero1);
        Integer n2 = Integer.valueOf(numero2);
        Integer n3 = Integer.valueOf(numero3);

        if(n1>n2){
            System.out.println("Comparación entre primer y segundo número: -1");
        }else if(n1 == n2){
            System.out.println("Comparación entre primer y segundo número: 0");
        }else{
            System.out.println("Comparación entre primer y segundo número: 1");
        }
*/


        //12. Convertir una temperatura de Celsius a Fahrenheit y viceversa
   /*     Scanner sc = new Scanner(System.in);
        System.out.println("Quieres Celsius o Fahrenheit?");
        String input = sc.nextLine();

        if(input.equals("Celsius")){
            System.out.println("Introduce la temperatura en grados Celsius: ");
            double celsius = sc.nextDouble();
            System.out.println("La temperatura en grados Fahrenheit es:" + (celsius * 9 / 5) + 32);
        }else{
            System.out.println("Introduce la temperatura en grados Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            System.out.println("La temperatura en grados Celsius es:" + (fahrenheit - 32) * 5/9 );
        }

*/

        //13. ¿Qué resultado esperas para cada operación?
/*        int a = 10;
        int b = 5;
        a += b;
        System.out.println(a); //15
        a *= b;
        System.out.println(a); //75
        a -= b;
        System.out.println(a); //70
*/

        //14. Crear un programa que calcule el área de un círculo:
  /*
        Double PI = 3.14;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio del círculo:");
        int radio = sc.nextInt();
        System.out.println("El área del círculo es: " + radio*radio*PI);
*/

        //15. ¿Qué resultado esperas para cada operación?
/*
        int x =10;
        int y = ++x +5;
        int z = x-- -3;
        System.out.println(y); //16
        System.out.println(z); //8
        */

        //16. Calcular el promedio de dos números decimales.
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número decimal: ");
        float primer = sc.nextFloat();
        System.out.println("Introduce el segundo número decimal: ");
        float segundo = sc.nextFloat();

        System.out.println("El promedio de " + primer + " y " + segundo + " es: " + (primer+segundo)/2);
*/

        //17. Por 5 cifras y mostrar progresivamente las últimas cifras del número
/*

        Scanner sc = new Scanner(System.in);
        System.out.println("Pone un número entero de 5 cifras: ");
        String input = sc.nextLine();
        String output = "";
        for(int i=4; i>=0; i--){
            output = input.charAt(i) + output;
            System.out.println(output);
        }
*/

        //18. ¿Cuál es el valor de las variables?
        //implícita: mas pequeño a más grande
        //explícita: más grande a maás pequeño
/*
        double numero = 9.7;
        int convertido = (int) numero;
        System.out.println("numero: " + numero); //9.7
        System.out.println("convertido: " + convertido); //9

        int entero = 10;
        double implicito = entero;
        System.out.println("entero: " + entero ); //10
        System.out.println("implicito: " + implicito ); //10.0
*/

        //19. ¿Cuál es el valor de b y el resultado final?
        // T
/*
        int a = 10;
        int b = 5;
        int c = 20;
        boolean result = (a + b*c > 100) && (b++ <a) || !(c-b*2 ==a);
        System.out.println(result);
*/

        //20. ¿Cuál es el valor de las variables?
        // 5, -5, 5, 6, 6
/*
        int a=5;
        System.out.println(a + " " + -a + " " + +a + " " + ++a + " " + a--);
*/

        //Scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número: ");
        int iNumero = sc.nextInt();
        System.out.println("Muestrame el número introducido " + iNumero);
        System.out.println("Dame un segundo número: ");
        double dNumero = sc.nextDouble();
        System.out.println("segundo" + dNumero);

    }
}
