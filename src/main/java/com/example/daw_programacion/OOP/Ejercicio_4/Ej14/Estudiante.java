package com.example.daw_programacion.OOP.Ejercicio_4.Ej14;

import java.util.List;

public class Estudiante extends Persona implements Evaluable{
    private List<Asignatura> asignaturas;

    private List<Horario> horarios;
    private List<Integer> notas;

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    @Override
    public double calcularPromedio() {
        int sum = 0;
        for ( int nota: this.notas) {
            sum += nota;
        }
        return (double) sum / notas.size();
    }

    @Override
    public boolean evaluar() {
        if(calcularPromedio() >= 5){
            return true;
        }else{
            return false;
        }
    }
}
