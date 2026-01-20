package com.example.daw_programacion.OOP.ejInterfaces.src.modeloclases;

public class Gato extends Animal{
	
	
	
    public Gato(String nombre) {
		super(nombre);
		
	}

	public void habla(){
        System.out.println("�Miau!" + getNombre());
    }
}