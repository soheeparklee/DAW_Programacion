package com.example.daw_programacion.Collections.ejercicioPDF;

public class Caja <T>{
    private String name;
    private T content;

    public Caja(String name, T content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public void printContent(T content){
        System.out.println(content);
    }
}
