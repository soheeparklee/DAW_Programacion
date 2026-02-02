//package com.example.daw_programacion.Exceptions;
//
//import com.example.daw_programacion.Exceptions.modelo.Alumno;
//import com.example.daw_programacion.Exceptions.excepciones.ExcepcionEducacionObligatoria;
//import com.example.daw_programacion.Exceptions.excepciones.ExcepcionInfantil;
//import com.example.daw_programacion.Exceptions.excepciones.ExceptionMayor;
//import com.example.daw_programacion.Exceptions.excepciones.ExceptionNoEresMayorEdad;
//
//
//public class Principal {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		com.example.daw_programacion.Exceptions.modelo.Alumno al = new Alumno(3434, "Bueno", 22);
//		try {
//
//			al.setEdad(2);
//
//		}
//		catch (ExcepcionInfantil ei) {
//			System.out.println(ei.getMessage());
//			 // me creo un objeto Infante y hay meto al chico
//		}
//		catch (ExcepcionEducacionObligatoria eeo) {
//			System.out.println(eeo.getMessage());
//			 //
//		}
//		catch (ExceptionNoEresMayorEdad eneme) {
//			System.out.println(eneme.getMessage());
//	        //
//		}
//		catch (ExceptionMayor em) {
//			System.out.println(em.getMessage());
//			// crear un objeto yayo
//		}
//
//
//	}
//}
