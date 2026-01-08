package com.example.daw_programacion.OOP;

import java.util.ArrayList;

public class Departamento {
    private String codigo;
    private String nombre;
    private String ubicacion;
    private ArrayList<Empleado> EmpleadoList;

    public Departamento(String codigo, String ubicacion, String nombre, ArrayList<Empleado> empleadoList) {
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        EmpleadoList = empleadoList;
    }
}
