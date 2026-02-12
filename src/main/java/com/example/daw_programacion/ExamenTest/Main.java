package com.example.daw_programacion.ExamenTest;

import com.example.daw_programacion.ExamenTest.excepciones.SaldoNegativo;
import com.example.daw_programacion.ExamenTest.modulo.Cuenta;
import com.example.daw_programacion.ExamenTest.modulo.CuentaCorriente;
import com.example.daw_programacion.ExamenTest.modulo.CuentaDeAhorro;
import com.example.daw_programacion.ExamenTest.modulo.CuentaDeAhorroEsp;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //(1) CuentaCorriente con 500 euros asociada a una Cuenta de Ahorro asociada de 300
        CuentaDeAhorro cuentaDeAhorro1 = new CuentaDeAhorro("A73950584", 1234, 300, 2019);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("A73950584",  5678, 500, cuentaDeAhorro1);

        //(1) dos cuentas de Ahorro especial con una penalización del 5% y el 3%
        CuentaDeAhorroEsp ahorroEsp1 = new CuentaDeAhorroEsp("C34857395",  1111, 100, 2025, 5);
        CuentaDeAhorroEsp ahorroEsp2 = new CuentaDeAhorroEsp("D34895739", 9724, 200, 2018, 3);

        //(1)(2) Banco con 10 cuentas
        CuentaDeAhorro cuentaDeAhorro2 = new CuentaDeAhorro("J9357893D", 2849, 200, 2015);
        CuentaDeAhorro cuentaDeAhorro3 = new CuentaDeAhorro("U48539759", 2859, 100, 2020);
        CuentaDeAhorro cuentaDeAhorro4 = new CuentaDeAhorro("45838979W", 8456, 900, 2021);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente("M48573985",  2495, 1500, cuentaDeAhorro2);
        CuentaCorriente cuentaCorriente3 = new CuentaCorriente("B47534853",  6845, 800, cuentaDeAhorro3);
        CuentaCorriente cuentaCorriente4 = new CuentaCorriente("A98475389",  3859, -100000000, cuentaDeAhorro4);

        HashSet<Cuenta> banco = new HashSet<>();
        banco.add(cuentaDeAhorro1);
        banco.add(cuentaCorriente1);
        banco.add(ahorroEsp1);
        banco.add(ahorroEsp2);
        banco.add(cuentaDeAhorro2);
        banco.add(cuentaDeAhorro3);
        banco.add(cuentaDeAhorro4);
        banco.add(cuentaCorriente2);
        banco.add(cuentaCorriente3);
        banco.add(cuentaCorriente4);

        //(2) Poner un saldo en cada una de ellas controlando que cuando introduzcas el saldo este no sea negativo
        // -> class Cuenta

        //(3) Mostrar información del total del saldo que se tiene en el banco
        System.out.println("total del saldo en el banco: " + totalSaldo(banco));


        //(3) la cuenta que tenga máxima penalización.
        CuentaDeAhorroEsp cuentaEspMax = maxPenalización(banco);
        System.out.println(cuentaEspMax);

        //(4) Pedir por pantalla un número de cuenta y pasar a extraer o añadir saldo.
        //Controlar mediante un bloque try-catch la retirada de dinero cuando sea necesario.
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.println("==============Entra un número de cuenta. Entra 0 para parar.================");
            input = Integer.parseInt(sc.nextLine());
            boolean cuentaFound = false;
            for (Cuenta cuenta : banco) {
                if(cuenta.getNumeroDeCuenta() == input){
                    cuentaFound = true;
                    System.out.println("======= Cuenta encontrado ======= " + cuenta.toString() + "=======");
                    System.out.println("Entra 1 para añadir saldo. \nEntra 2 para extraer saldo.");
                    int action = Integer.parseInt(sc.nextLine());
                    switch(action){
                        case 1:
                            System.out.println("Quanto quieres añadir?");
                            int anadir = Integer.parseInt(sc.nextLine());
                            cuenta.ingresarDinero(anadir);
                            break;
                        case 2:
                            System.out.println("Quanto quieres extraer?");
                            int extraer = Integer.parseInt(sc.nextLine());
                            try{
                                cuenta.retriarDinero(extraer);
                            }catch(SaldoNegativo e){
                                System.out.println(e.getMessage());
                            }
                            break;
                        default:
                            System.out.println("No action. Solo puedes poner 1 o 2");
                            break;
                    }
                }
            }
            if(!cuentaFound){
                System.out.println("No cuenta con número " + input + " Entra otra vez. ");
            }
        }while(input != 0);

        //Traspasar a un array de 5 posiciones las cuentas que tienen mayor cuantía
        //ordenando dicho array de menor a mayor cuantía en sus cuentas
        ArrayList<Cuenta> cuentaList = new ArrayList<>();
        for (Cuenta cuenta : banco) {
            cuentaList.add(cuenta);
        }
        Collections.sort(cuentaList);
        List<Cuenta> cuentaSubList = cuentaList.subList(0, 5);
        for (Cuenta cuenta : cuentaSubList) {
            System.out.println(cuenta.toString());
        }

    }

    public static double totalSaldo(HashSet<Cuenta> banco){
        double saldoTotal = 0;
        for (Cuenta cuenta : banco) {
            if(cuenta instanceof CuentaCorriente){
                saldoTotal += cuenta.getSaldo();
            }
        }
        return saldoTotal;
    }

    public static CuentaDeAhorroEsp maxPenalización(HashSet<Cuenta> banco){
        int maxPen = 0;
        CuentaDeAhorroEsp cuentaEsp = new CuentaDeAhorroEsp("", 0, 0, 0, 0);
        for (Cuenta cuenta : banco) {
            if(cuenta instanceof CuentaDeAhorroEsp){
                if(((CuentaDeAhorroEsp) cuenta).getPenalizacion() > maxPen){
                    maxPen = ((CuentaDeAhorroEsp) cuenta).getPenalizacion();
                    cuentaEsp = (CuentaDeAhorroEsp) cuenta;
                }
            }
        }
        return cuentaEsp;
    }

}
