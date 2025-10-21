package com.example.daw_programacion.Unit3_class_ejercicio_1;

public class E4_MedicoMain {
    public static void main(String[] args) {
        E4_MedicoAñadido medico = new E4_MedicoAñadido();
        medico.setNombre("So Hee");
        System.out.println("Ha cambiado el nombre del médico. El nuevo nombre es: " + medico.getNombre());

        medico.setApellido("Park");
        System.out.println("Ha cambiado el apellido del médico de nombre " + medico.getNombre() + ". El nuevo apellido es: " + medico.getApellido());

        medico.setEdad(47);
        System.out.println("Ha cambiado el edad del médico de nombre " + medico.getNombre() + ". El nuevo edad es: " + medico.getEdad());

        medico.setCasado(true);
        System.out.println("Ha cambiado si esta casado del médico de nombre " + medico.getNombre() + ". El nuevo valor es: " + medico.isCasado());

        medico.setNumeroDocumentoIdentidad("P11111111Q");
        System.out.println("Ha cambiado el numeroDocumentoIdentidad del médico de nombre " + medico.getNombre() + ". El nuevo numeroDocumentoIdentidad es: " + medico.getNumeroDocumentoIdentidad());

        medico.setEspecialidad("psiquiatra");
        System.out.println("Ha cambiado el especialidad del médico de nombre " + medico.getNombre() + ". El nuevo especialidad es: " + medico.getEspecialidad());

        int cuanto = medico.calculoParaMultiploEdad();

        System.out.println("El médico de nombre " + medico.getNombre() +  "con especialidad " + medico.getEspecialidad() + " tendrá una edad múltiplo de 5 dentro de " + cuanto + "  años");
        System.out.println("Monstrar en main class: " + cuanto);
    }
}
