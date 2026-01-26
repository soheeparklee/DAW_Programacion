package com.example.daw_programacion.OOP.Ejercicio_3.version3;



import java.time.LocalDate;

public abstract class Contrato implements GestionarContrato{
    private Empresa empresa;
    private String empleado;
    private Puesto puesto;
    private Nivel nivel;
    private int salario;
    private LocalDate fechaInicio;

    private static int totalContratos; //should be static, shared among all contract instances


    public Contrato(Empresa empresa, String empleado, Puesto puesto, Nivel nivel, int salario, LocalDate fechaInicios) {
        this.empresa = empresa;
        this.empleado = empleado;
        this.puesto = puesto;
        this.nivel = nivel;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
        this.totalContratos++;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }


    public abstract String monstrarContrato();

    @Override
    public void incrementarSalario(double porcentaje) {
        this.salario *= (1+(porcentaje/100));
    }

    @Override
    public Contrato compararSalario(Contrato otroContrato) {
        if(this.salario >= otroContrato.salario){
            return this;
        }else{
            return otroContrato;
        }
    }

    @Override
    public void rescindirContrato() {
        totalContratos--;
    }

    @Override
    public int totalDeContratos() {
        return totalContratos;
    }



}
