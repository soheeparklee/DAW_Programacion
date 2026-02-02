package com.example.daw_programacion.Exceptions;

public class Alumno {
    private String nombre;
    private String apellido;

    public Alumno(String nombre, String apellido) throws Exception{
        if(nombre == null || apellido == null) throw new Exception("Argumento no validos");
        else{
            //si el constructor lanza la excepcion el objeto no se crea
            this.nombre = nombre;
            this.apellido = apellido;
        }
    }

    public static void main(String[] args) {
        try{
            Alumno alumno = new Alumno(null, "Galan");
            System.out.println(alumno.nombre);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
