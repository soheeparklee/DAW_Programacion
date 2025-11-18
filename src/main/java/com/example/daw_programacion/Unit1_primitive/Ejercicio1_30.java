package com.example.daw_programacion.Unit1_primitive;

public class Ejercicio1_30 {
    public static void main(String[] args) {
        //⭐️21. ¿Qué sucederá?
        // Porque este pasa?
        // This is a problem with Scanner when mixing nextXXX() that do not consume newline and nextLine()
        // When I input nextInt() and press enter, enter is read to be the nextLine()
        // Resulting in returning the int and a blank line

        // scanner.close()
        // If you close a scanner, you will not be able to call a scanner again in the same class
        // You cannot create another object new Scanner() again in the same class after closing
        // Only one object Scanner() per class

        // solution_1
 /*       Scanner sc = new Scanner(System.in);

        System.out.println("Pone número: ");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Pone cadena: ");
        String cadena = sc.nextLine();

        System.out.println(numero);
        System.out.println(cadena);
*/
        // solution_2
/*        Scanner sc = new Scanner(System.in);

        System.out.println("Pone número: ");
        Integer numero = Integer.parseInt(sc.nextLine());

        System.out.println("Pone cadena: ");
        String cadena = sc.nextLine();

        System.out.println(numero);
        System.out.println(cadena);
*/

/*
        ✅ printf
        %d: int, long
        %f: decimal float, double, usar %.2f para dos decimales
        %s: String
        %c: char
        %b: boolran
        %n: para salto de línea, mejor que \n ya que es portable entre sistemas
*/
        //22. Modifícalo utilizando printf
/*
        int edad = 25;
        int años = 5;
        double salario = 3000.20;
        double incremento = 250.75;
        String nombre = "Ana";
        String apellido = "Garcia";
        char inicial = 'A';
        boolean esEmpleado = true;

        Leyenda de Formato en printf:
        ✔️ %-20s : Alinea una cadena (String) a la izquierda en un espacio de 10 caracteres.
        Ejemplo: printf("%-10s", "Texto");
        ✔️ %5d : Alinea un entero (int) a la derecha en un espacio de 10 caracteres.
        Ejemplo: printf("%10d", 123);
        ⭐️ %10.2f : Alinea un número decimal (double) a la derecha en un espacio de 10 caracteres
        con 2 decimales.
        Ejemplo: printf("%10.2f", 123.45);
        ✔️ %n : Salto de línea.
        Ejemplo: printf("%n");

        System.out.printf("Hay una chica que se llama %s, empienzando con un %c y su apellido es %s. %nElla tiene %d edad y tiene %d años de experiencia. %nSu salario es %f y el incremento es %f. %nEs %b que ella es empleado."
                        , nombre, inicial, apellido, edad, años, salario, incremento, esEmpleado);
*/

        System.out.printf("%-10s", "Hola");
        System.out.printf("%-10s", "Mundo");

        //23. Análisis de Ventas Semanales
        double lunes = 1500.75;
        double martes = 1300.30;
        double miercoles = 1100.57;

        double totalDeVentas = lunes + martes + miercoles;
        double porLunes = lunes / totalDeVentas * 100;
        double porMartes = martes / totalDeVentas * 100;
        double porMiercoles = miercoles / totalDeVentas * 100;
        double totalIva= totalDeVentas * (1-0.21);
        double totalDescuentos = lunes * 0.9 + martes * 0.85 + lunes * 0.95;
        double diferencia = totalDeVentas - totalDescuentos;

    }
}
