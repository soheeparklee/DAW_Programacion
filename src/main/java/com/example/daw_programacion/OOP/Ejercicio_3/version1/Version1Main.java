package com.example.daw_programacion.OOP.Ejercicio_3.version1;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Version1Main {
    public static void main(String[] args) {
        //Crear tres contratos (dos con duración y uno indefinido).
        Contrato conDuracion1 = new Contrato("Next Digital", "Hubo", "Desarolloador Java", 3200, LocalDate.of(2023, 01, 06), 12);
        Contrato conDuracion2 = new Contrato("BBVA IT", "Ana", "Arquitecta de software", 4000, LocalDate.of(2024, 01, 01), 24);
        Contrato indefinido = new Contrato("NTT Data", "Lluis Delafont", "Analista de Datos", 5000, LocalDate.of(2022, 01, 03));

        // ⭐️ 내가 원하는 형식으로 날짜 뽑기
        // Imprime la fecha y hora en la que se ejecuta el main
        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        String text = datetime.format(formatter);
        System.out.println("Monstrando contratos en fecha: " + text);

        // Mostrar los contratos creados.
        System.out.println(conDuracion1.monstrarContrato());
        System.out.println(conDuracion2.monstrarContrato());
        System.out.println(indefinido.monstrarContrato());

        // Comparar el salario de dos contratos.
        Contrato higher = conDuracion1.compararSalario(conDuracion2);
        System.out.println("El contracto de " + higher.getEmpleado() + " tiene un salario mayor.");

        // Aumentar el salario de un contrato.
        System.out.println(conDuracion1.getSalario());
        conDuracion1.aumentarSalario(10);
        System.out.println(conDuracion1.getSalario());

        // Intentar renovar un contrato indefinido (debe fallar).
        indefinido.renovarContrato(2);

        // Renovar un contrato con duración definida.
        System.out.println(conDuracion1.renovarContrato(2));

        // Rescindir un contrato y verificar el total de contratos activos.
        indefinido.rescindirContrato();
        System.out.println("El contrato de " + indefinido.getEmpleado() + " ha sido rescinido.");

        // Mostrar el número total de contratos creados.
        System.out.println(indefinido.getTotalContratos());

    }
}
