package com.example.daw_programacion.OOP.Ejercicio_5.Ej9;

public class Main {
    public static void main(String[] args) {
        RouterWifi routerWifi1 = new RouterWifi();
        routerWifi1.conectar();
        RouterWifi routerWifi2 = new RouterWifi();
        routerWifi2.conectar();


        routerWifi1.desconectar();

        System.out.println("==================");

        BluetoothSpeaker speaker = new BluetoothSpeaker();
        speaker.conectar();
        speaker.desconectar();
    }
}
