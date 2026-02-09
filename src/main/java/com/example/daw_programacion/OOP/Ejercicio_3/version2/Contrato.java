package com.example.daw_programacion.OOP.Ejercicio_3.version2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public abstract class Contrato implements GestionarContrato, BeneficiosContrato{
    private Empresa empresa;
    private String empleado;
    private Puesto puesto;
    private Nivel nivel;
    private int salario;
    private LocalDate fechaInicio;
    private ArrayList<BeneficioSocial> beneficiosSociales;
    private ArrayList<GastoIncluido> gastosCubiertos;
    private static int totalContratos; //should be static, shared among all contract instances



    public Contrato(Empresa empresa, String empleado, Puesto puesto, Nivel nivel, int salario, LocalDate fechaInicios) {
        this.empresa = empresa;
        this.empleado = empleado;
        this.puesto = puesto;
        this.nivel = nivel;
        this.salario = salario;
        this.fechaInicio = fechaInicio;
        this.beneficiosSociales = new ArrayList<>();
        this.gastosCubiertos = new ArrayList<>();
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

//    @Override
//    public Contrato compararSalario(Contrato otroContrato) {
//        if(this.salario >= otroContrato.salario){
//            return this;
//        }else{
//            return otroContrato;
//        }
//    }



    @Override
    public void rescindirContrato() {
        totalContratos--;
    }

    @Override
    public int totalDeContratos() {
        return totalContratos;
    }

    // Asignar beneficios
    @Override
    public void otorgarBeneficio(BeneficioSocial beneficio){
        this.beneficiosSociales.add(beneficio);
    }

    public ArrayList<BeneficioSocial> getBeneficiosSociales() {
        return beneficiosSociales;
    }

    // Incluir gastos
    @Override
    public void incluirGasto(GastoIncluido gasto){
        this.gastosCubiertos.add(gasto);
    }

    public ArrayList<GastoIncluido> getGastosCubiertos() {
        return gastosCubiertos;
    }
}
