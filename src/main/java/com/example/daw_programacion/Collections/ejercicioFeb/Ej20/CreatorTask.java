package com.example.daw_programacion.Collections.ejercicioFeb.Ej20;

public class CreatorTask implements Runnable{
    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {

            ProcesoPrioritario p = new ProcesoPrioritario("task1", 100, 1);
            System.out.println("Created: " + p);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // important
            }
        }

        System.out.println("Creator stopped");
    }
}
