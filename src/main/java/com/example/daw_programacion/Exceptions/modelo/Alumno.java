package com.example.daw_programacion.Exceptions.modelo;

import com.example.daw_programacion.Exceptions.excepciones.*;

public class Alumno {
	
	private int nexp;
	private String apellido;
	private int edad;

	public Alumno(int nexp, String apellido, int edad) {
		super();
		this.nexp = nexp;
		this.apellido = apellido;
		this.edad = edad;
	}

	public int getNexp() {
		return nexp;
	}

	public void setNexp(int nexp) {
		this.nexp = nexp;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws ExcepcionInfantil, ExcepcionEducacionObligatoria, ExceptionNoEresMayorEdad, ExceptionNoMessage {
		if (edad >= 18 && edad <= 100)
		{
			this.edad = edad;
		}
		else if (edad>=0 && edad <=3)
		{
			throw new ExcepcionInfantil();
		}
		else if (edad >3 && edad <= 16)
		{
			throw new ExcepcionEducacionObligatoria("est�s en la ESO o primaria");
		}
		else if (edad > 16 && edad < 18)
		{
			throw new ExceptionNoEresMayorEdad("no llegas a ser mayor de edad");
		}
		else
		{
			throw new ExceptionNoMessage();
			//throw new ExceptionMayor("eres un poco mayor para dar clase");
		}
	}

	@Override
	public String toString() {
		return "Alumno [nexp=" + nexp + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	

}
