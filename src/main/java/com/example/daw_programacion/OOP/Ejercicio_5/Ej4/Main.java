package com.example.daw_programacion.OOP.Ejercicio_5.Ej4;

public class Main {
    public static void main(String[] args) {
        DispositivoAlmacenamiento da1 = new DiscoDuro();
        DispositivoAlmacenamiento da2 = new USB();
        DispositivoAlmacenamiento da3 = new TarjetaSB();

        callDispositivo(da1);
        callDispositivo(da2);
        callDispositivo(da3);

    }
    public static void callDispositivo(DispositivoAlmacenamiento da){
        da.guardarDatos("Hello");
    }
}
