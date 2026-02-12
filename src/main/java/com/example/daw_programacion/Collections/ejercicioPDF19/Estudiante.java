package com.example.daw_programacion.Collections.ejercicioPDF19;

import java.util.ArrayList;
import java.util.Objects;

public class Estudiante {
    private String ID;
    private String Nombre;




    public Estudiante(String ID, String nombre) {
        this.ID = ID;
        Nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudiante that)) return false;
        return Objects.equals(ID, that.ID) && Objects.equals(Nombre, that.Nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, Nombre);
    }
}
