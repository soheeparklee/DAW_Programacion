package com.example.daw_programacion.OOP;

public class Empleado {
    private String codigo;
    private String nombre;
    private String apellido;
    private Integer salario;
    private String puesto;

    public Empleado() {
    }

    public Empleado(String codigo, String nombre, String apellido, Integer salario, String puesto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.puesto = puesto;
    }
}
