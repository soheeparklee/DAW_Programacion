package com.example.daw_programacion.ExamenTest;

public class CuentaCorriente extends Cuenta{
    private CuentaDeAhorro cuentaDeAhorro;

    public CuentaCorriente(String DNI, double saldo, CuentaDeAhorro cuentaDeAhorro) {
        super(DNI, saldo);
        this.cuentaDeAhorro = cuentaDeAhorro;
    }


    @Override
    boolean retriarDinero(int retirarAmount) {
        double saldoActual = super.getSaldo();
        if(saldoActual >= retirarAmount){
            saldoActual -=retirarAmount;
            System.out.println("Dinero retirar en cuenta corriente con exito");
            return true;
        }else{
            if(saldoActual + cuentaDeAhorro.getSaldo() > retirarAmount){
                saldoActual = 0;
                double resto = retirarAmount - saldoActual;
                cuentaDeAhorro.setSaldo(cuentaDeAhorro.getSaldo() - resto);
                System.out.println("Dinero retirar en cuenta corriente usando cuenta de ahorro");
                return true;
            }else{
                System.out.println("Dinero retirar en cuenta corriente fallado");
                return false;
            }
        }
    }


}
