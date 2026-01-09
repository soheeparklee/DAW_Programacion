package com.example.daw_programacion.OOP;

import java.util.ArrayList;

public class EmpleadoMain {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("1111", "Jam", "Harvey", 10, "Madrid");
        Empleado empleado2 = new Empleado("2222", "Pam", "Sarvey", 10, "Paris");
        Empleado empleado3 = new Empleado("3333", "Ram", "Darvey", 10, "London");

        ArrayList<Empleado> empleadoArrayList = new ArrayList<>();
        empleadoArrayList.add(empleado1);
        empleadoArrayList.add(empleado2);
        empleadoArrayList.add(empleado3);
        empleadoArrayList.add(empleado3);

        Departamento departamento = new Departamento("12abc", "LA", "Programming", empleadoArrayList);



    }
}
