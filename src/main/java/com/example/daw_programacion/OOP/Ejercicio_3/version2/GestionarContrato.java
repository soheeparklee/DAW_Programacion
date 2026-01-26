package com.example.daw_programacion.OOP.Ejercicio_3.version2;

public interface GestionarContrato {
    public String monstrarContrato();
    public void incrementarSalario(double porcentaje);
    public Contrato compararSalario(Contrato otroContrato);

    public void rescindirContrato();
    public int totalDeContratos();




}
