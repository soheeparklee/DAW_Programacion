package com.example.daw_programacion.Unit3_class_ejercicio;

public class E4_MedicoAñadido {
    String nombre;
    String apellido;
    int edad;
    boolean casado;
    String numeroDocumentoIdentidad;
    String especialidad;

    public E4_MedicoAñadido(){
        this.nombre = "John";
        this.apellido = "Doe";
        this.edad = 40;
        this.casado = false;
        this.numeroDocumentoIdentidad = "A1234567890Z";
        this.especialidad = "Dermatologia";
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
        System.out.println("Ha cambiado el nombre del médico. El nuevo nombre es: " + this.nombre);
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
        System.out.println("Ha cambiado el apellido del médico de nombre " + this.nombre + ". El nuevo apellido es: " + this.apellido);
    }

    public void setEdad(int edad){
        this.edad = edad;
        System.out.println("Ha cambiado el edad del médico de nombre " + this.nombre + ". El nuevo edad es: " + this.edad);
    }

    public void setCasado(boolean casado){
        this.casado = casado;
        System.out.println("Ha cambiado si esta casado del médico de nombre " + this.nombre + ". El nuevo valor es: " + this.casado);
    }

    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad){
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        System.out.println("Ha cambiado el numeroDocumentoIdentidad del médico de nombre " + this.nombre + ". El nuevo numeroDocumentoIdentidad es: " + this.numeroDocumentoIdentidad);
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
        System.out.println("Ha cambiado el especialidad del médico de nombre " + this.nombre + ". El nuevo especialidad es: " + this.especialidad);
    }

    public int calculoParaMultiploEdad(){
        int edad = this.edad;
        int resulto = 5 - (edad % 5);
        System.out.println("El médico de nombre " + this.nombre +  "con especialidad " + this.especialidad + " tendrá una edad múltiplo de 5 dentro de " + resulto + " años");
        return resulto;
    }

    //main class
    public static void main(String[] args) {
            E4_MedicoAñadido medico = new E4_MedicoAñadido();
            medico.setNombre("So Hee");
            medico.setApellido("Park");
            medico.setEdad(47);
            medico.setCasado(true);
            medico.setNumeroDocumentoIdentidad("P11111111Q");
            medico.setEspecialidad("psiquiatra");

            int cuanto = medico.calculoParaMultiploEdad();
            System.out.println("Monstrar en main class: " + cuanto);
    }
}
