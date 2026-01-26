package com.example.daw_programacion.OOP.Ejercicio_3.version1;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contrato {
    private String empresa;
    private String empleado;
    private String puesto;
    private int salario;
    private LocalDate fechaInicio;
    private Integer duracionMeses;
    private boolean esIndefinido;
    private static int totalContratos; //should be static, shared among all contract instances


    // constructor para con duracion

    public Contrato(String empresa, String empleado, String puesto, int salario, LocalDate fechaInicio, int duracionMeses) {
        this.empresa = empresa;
        this.empleado = empleado;
        this.puesto = puesto;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
        this.duracionMeses = duracionMeses;
        this.esIndefinido = false;
        this.totalContratos++;
    }

    // constructor para contractos indefinidos

    public Contrato(String empresa, String empleado, String puesto, int salario, LocalDate fechaInicio) {
        this.empresa = empresa;
        this.empleado = empleado;
        this.puesto = puesto;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
        this.duracionMeses = null;
        this.esIndefinido = true;
        this.totalContratos++;
    }

    //getters & setters


    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
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

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    public boolean isEsIndefinido() {
        return esIndefinido;
    }

    public int getTotalContratos() {
        return totalContratos;
    }


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public String monstrarContrato() {
        String result = "------------------" + '\n' +
                "Detalles del contrato: " + '\n' +
                "Empresa='" + empresa + '\n' +
                "Empleado='" + empleado + '\n' +
                "Puesto='" + puesto + '\n' +
                "Salario=" + salario + " euros/mes" + '\n' +
                "fechaInicio: " + fechaInicio.format(formatter) + '\n';
        if(!this.esIndefinido){
            result +=  "Duracion: " + duracionMeses;
                    return result;
        }else{
            result +=  "Duracion: indefinido";
            return result;
        }
    }

    public void aumentarSalario(double porcentaje){
        this.salario *= (1+(porcentaje/100));
    }

    public boolean renovarContrato(int meses){
        if(!this.esIndefinido){
            this.duracionMeses += meses;
            System.out.println("Contrado renovado por " + meses);
            return true;
        }else{
            System.out.println("No se puede renovar un contrato indefinido");
            return false;
        }
    }

    public Contrato compararSalario(Contrato otroContrato){
        if(this.salario > otroContrato.getSalario()){
            return this;
        }else{
            return otroContrato;
        }
    }

    public void rescindirContrato(){
        totalContratos--;
    }

}
