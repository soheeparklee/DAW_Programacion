package com.example.daw_programacion.OOP.Ejercicio_3.version3;

public interface GestionarContrato {
    public String monstrarContrato();
    public void incrementarSalario(double porcentaje);
    public Contrato compararSalario(Contrato otroContrato);

    public void rescindirContrato();
    public int totalDeContratos();




}
