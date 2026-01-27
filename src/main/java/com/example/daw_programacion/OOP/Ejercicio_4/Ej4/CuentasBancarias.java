package com.example.daw_programacion.OOP.Ejercicio_4.Ej4;

public class CuentasBancarias {
    private  final String BANCO_NOMBRE = "Caixa";
    //final String BANCO_NOMBRE = "Caixa";
    private int saldo;

/*
    public void setNombre(String nombre) {
        this.BANCO_NOMBRE = nombre;
    }
*/

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String monstrarDatos() {
        return "CuentasBancarias{" +
                "BANCO_NOMBRE='" + BANCO_NOMBRE + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
