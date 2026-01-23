package com.example.daw_programacion.Collections.ejercicioPDF19;

import java.util.ArrayList;
import java.util.Objects;

public class Asignatura {
    private String asignaturaNombre;

    public Asignatura(String asignaturaNombre) {
        this.asignaturaNombre = asignaturaNombre;
    }

    public String getAsignaturaNombre() {
        return asignaturaNombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Asignatura that)) return false;
        return Objects.equals(asignaturaNombre, that.asignaturaNombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asignaturaNombre);
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "asignaturaNombre='" + asignaturaNombre + '\'' +
                '}';
    }
}
