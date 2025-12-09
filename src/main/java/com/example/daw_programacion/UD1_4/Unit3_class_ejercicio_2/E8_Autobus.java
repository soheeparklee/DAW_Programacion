package com.example.daw_programacion.UD1_4.Unit3_class_ejercicio_2;

public class E8_Autobus {
    private String numeroDeLinea;
    private String ruta;
    private int capacidadMaxima;
    private int pasajeroActuales;
    private String horario;
    private int tiempoDeEspera;
    private boolean enRuta; //true=en ruta, false=detenido

    public E8_Autobus(String numeroDeLinea, String ruta, int capacidadMaxima, String horario, int tiempoDeEspera){
        this.numeroDeLinea = numeroDeLinea;
        this.ruta = ruta;
        this.capacidadMaxima = capacidadMaxima;
        this.pasajeroActuales = 0;
        this.horario = horario;
        this.tiempoDeEspera = tiempoDeEspera;
        this.enRuta = false;
    }
    public void iniciarRuta(){
        this.enRuta = true;
    }
    public void finalizarRuta(){
        this.pasajeroActuales = 0;
        this.enRuta = false;
    }
    public void actualizarTiempoEspera(int nuevoTiempo){
        this.tiempoDeEspera += nuevoTiempo;
    }
    public void recogerPasajeros(int cantidad){
        this.pasajeroActuales += cantidad;
    }
    public void bajarPasajeros(int cantidad){
        this.pasajeroActuales -= cantidad;
    }
    public boolean hayAsientosDisponibles(){
        if(this.capacidadMaxima - this.pasajeroActuales > 0) return true;
        else return false;
    }
    public void mostrarInfo(){
        System.out.println("numeroDeLinea: " + numeroDeLinea + " ruta: " + ruta +" capacidadMaxima: " + capacidadMaxima + " pasajeroActuales: " + pasajeroActuales + " horario: " + horario + " tiempoDeEspera: " + tiempoDeEspera + " enRuta: " + enRuta);
    }

    @Override
    public String toString() {
        return "E8_Autobus{" +
                "numeroDeLinea='" + numeroDeLinea + '\'' +
                ", ruta='" + ruta + '\'' +
                ", capacidadMaxima=" + capacidadMaxima +
                ", pasajeroActuales=" + pasajeroActuales +
                ", horario='" + horario + '\'' +
                ", tiempoDeEspera=" + tiempoDeEspera +
                ", enRuta=" + enRuta +
                '}';
    }
}
