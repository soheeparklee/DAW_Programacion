package com.example.daw_programacion.OOP.Ejercicio_3.version3;





import java.time.LocalDate;
import java.util.ArrayList;

public class ContratoIndefinido extends Contrato implements BeneficiosContrato {
    private Coche cocheEmpresa;

    private ArrayList<BeneficioSocial> beneficiosSociales;
    private ArrayList<GastoIncluido> gastosCubiertos;


    public ContratoIndefinido(Empresa empresa, String empleado, Puesto puesto, Nivel nivel, int salario, LocalDate fechaInicios) {
        super(empresa, empleado, puesto, nivel, salario, fechaInicios);
        this.beneficiosSociales = new ArrayList<BeneficioSocial>();
        this.gastosCubiertos = new ArrayList<GastoIncluido>();
    }

    public ContratoIndefinido(Empresa empresa, String empleado, Puesto puesto, Nivel nivel, int salario, LocalDate fechaInicio, Coche cocheEmpresa) {
        super(empresa, empleado, puesto, nivel, salario, fechaInicio);
        this.cocheEmpresa = cocheEmpresa;
        this.beneficiosSociales = new ArrayList<BeneficioSocial>();
        this.gastosCubiertos = new ArrayList<GastoIncluido>();
    }

    @Override
    public String monstrarContrato() {
        return "ContratoIndefinido - Empleado: " + super.getEmpleado() + '\n' +
                "cocheEmpresa: " + cocheEmpresa;
    }

    //Asignar un coche
    public void setCocheEmpresa(Coche cocheEmpresa) {
        this.cocheEmpresa = cocheEmpresa;
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
