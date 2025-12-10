package com.example.daw_programacion.Iterator;

public class Alumno {

    private int nExp;
    private String nombre;
    private String apellido;


    public Alumno(int nExp, String nombre, String apellido) {
        super();
        this.nExp = nExp;
        this.nombre = nombre;
        this.apellido = apellido;
    }


    public int getnExp() {
        return nExp;
    }


    public void setnExp(int nExp) {
        this.nExp = nExp;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    @Override
    public String toString() {
        return "Alumno [nExp=" + nExp + ", nombre=" + nombre + ", apellido=" + apellido + "]";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + nExp;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alumno other = (Alumno) obj;
        if (nExp != other.nExp)
            return false;
        return true;
    }




}
