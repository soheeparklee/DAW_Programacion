package com.example.daw_programacion.UD1_4.Unit3_class_ejercicio_1;

public class E3_Medico {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean casado;
    private String numeroDocumentoIdentidad;
    private String especialidad;

    public E3_Medico(){
        this.nombre = "John";
        this.apellido = "Doe";
        this.edad = 40;
        this.casado = false;
        this.numeroDocumentoIdentidad = "A1234567890Z";
        this.especialidad = "Dermatologia";
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setCasado(boolean casado){
        this.casado = casado;
    }

    public void setNumeroDocumentoIdentidad(String numeroDocumentoIdentidad){
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }

    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }

    //main class
    public static void main(String[] args) {
            E3_Medico medico = new E3_Medico();
            medico.setNombre("So Hee");
            System.out.println("Ha cambiado el nombre del médico. El nuevo nombre es: " + medico.nombre);
            medico.setApellido("Park");
            System.out.println("Ha cambiado el apellido del médico de nombre " + medico.nombre + ". El nuevo apellido es: " + medico.apellido);
            medico.setEdad(20);
            System.out.println("Ha cambiado el edad del médico de nombre " +medico.nombre + ". El nuevo edad es: " + medico.edad);
            medico.setCasado(true);
            System.out.println("Ha cambiado si esta casado del médico de nombre " + medico.nombre + ". El nuevo valor es: " + medico.casado);
            medico.setNumeroDocumentoIdentidad("P11111111Q");
            System.out.println("Ha cambiado el numeroDocumentoIdentidad del médico de nombre " + medico.nombre + ". El nuevo numeroDocumentoIdentidad es: " + medico.numeroDocumentoIdentidad);
            medico.setEspecialidad("Psiquiatra");
            System.out.println("Ha cambiado el especialidad del médico de nombre " + medico.nombre + ". El nuevo especialidad es: " + medico.especialidad);
    }
}
