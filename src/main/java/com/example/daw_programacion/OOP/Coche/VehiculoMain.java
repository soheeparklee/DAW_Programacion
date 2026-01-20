package com.example.daw_programacion.OOP.Coche;

public abstract class VehiculoMain {
     public static void main(String[] args) {
         Coche coche1 = new Coche("one", 4, true);
         System.out.println(coche1);
/*        // Vehiculo v = new Vehiculo();
        // ERROR: no se puede instanciar abstracta
                Vehiculo v1 = new Coche();
                Vehiculo v2 = new Bicicleta();
                v1.encender();
        // Vehículo encendido
                v1.acelerar();
        // Coche acelerando con motor de gasolina
                v1.frenar();
        // Coche frenando con pastillas de freno
                v2.encender();
        // Vehículo encendido
                v2.acelerar();
        // Bicicleta acelerando pedaleando
                v2.frenar();
        // Bicicleta frenando con zapatas*/
         }
}
