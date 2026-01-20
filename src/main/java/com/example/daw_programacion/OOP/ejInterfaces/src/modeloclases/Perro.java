package com.example.daw_programacion.OOP.ejInterfaces.src.modeloclases;

public class Perro extends Animal {
	
	
	public Perro(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}


	public void habla(){
        System.out.println("�Guau!" + getNombre());
    }
}
