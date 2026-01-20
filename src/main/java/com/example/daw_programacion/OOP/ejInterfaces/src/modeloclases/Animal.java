package com.example.daw_programacion.OOP.ejInterfaces.src.modeloclases;

public abstract class Animal implements Parlanchin {
	
	private String nombre;

	
	
	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public abstract void habla();
}
