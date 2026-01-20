package com.example.daw_programacion.OOP.ejInterfaces.src.modeloclases;

public abstract class Reloj implements Parlanchin {
	
	private String tipo;

	public Reloj(String tipo) {
		super();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	//public abstract void habla();
}

