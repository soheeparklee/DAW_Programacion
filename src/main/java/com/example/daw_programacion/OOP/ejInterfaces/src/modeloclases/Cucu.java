package com.example.daw_programacion.OOP.ejInterfaces.src.modeloclases;

public class Cucu extends Reloj {
	
	
	
	public Cucu(String tipo) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}

	public void habla(){
        System.out.println("�Cucu, cucu, ..!" + getTipo());
    }

}
