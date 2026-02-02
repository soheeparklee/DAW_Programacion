package com.example.daw_programacion.OOP.Ejercicio_5.Ej7;

import org.springframework.objenesis.SpringObjenesis;

import java.lang.annotation.Target;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PagoTarjeta tarjeta = new PagoTarjeta(100);
        PagoPayPal paypal = new PagoPayPal("Jenny", 3);

        double precio = 20;
        System.out.println("Seleccione el metodo de pago.\n" +
                "1: tarjeta\n" +
                "2: paypal");
        Scanner sc = new Scanner(System.in);
        int input = Integer.parseInt(sc.nextLine());

        switch(input){
            case 1:
                System.out.println(tarjeta.descontarSaldo());
                tarjeta.procesarPago(precio);
                break;
            case 2:
                System.out.println("Validar Usuario nombre: ");
                String usuario = sc.nextLine();
                if(paypal.validarUsuario(usuario)){
                    paypal.procesarPago(precio);
                }else{
                    System.out.println("No podia pagar con paypal");
                }


        }
    }
}
