package com.example.daw_programacion.ExamenTestCoche.Exceptions;

public class DiasInvalidosException extends Exception{
    public DiasInvalidosException(String message) {
        super("Fail: Solo puedes alquilar un coche mas de 1 dia.");
    }
}
