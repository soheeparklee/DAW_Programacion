package com.example.daw_programacion.OOP.Ejercicio_5.Ej9;

public class BluetoothSpeaker implements Conectable{
    private boolean connectado;
    @Override
    public void conectar() {
        connectado = true;
        System.out.println("Altavoz bluetooth conectado: " + connectado);
        reproducirSonido();
    }

    @Override
    public void desconectar() {
        System.out.println("Bluetooth speaker descnectado");
    }

    public void reproducirSonido(){
        System.out.println("La La La");
    }
}
