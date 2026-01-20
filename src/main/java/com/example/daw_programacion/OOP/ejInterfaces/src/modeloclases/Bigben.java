package com.example.daw_programacion.OOP.ejInterfaces.src.modeloclases;

public class Bigben extends Reloj {
	

	
	public Bigben(String tipo) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void habla() 
	{
		System.out.println("Doingggggg Doingggg!" + getTipo());
	}

}
