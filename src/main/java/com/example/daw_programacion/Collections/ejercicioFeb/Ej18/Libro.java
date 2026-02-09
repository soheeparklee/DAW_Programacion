package com.example.daw_programacion.Collections.ejercicioFeb.Ej18;

import java.util.Objects;

public class Libro {
    private String ISBN;
    private String title;
    private String autor;
    private Integer year;
    private String genre;

    public Libro(String ISBN, String title, String autor, Integer year, String genre) {
        this.ISBN = ISBN;
        this.title = title;
        this.autor = autor;
        this.year = year;
        this.genre = genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Libro[" +
                "ISBN='" + ISBN  +
                ", title='" + title  +
                ", autor='" + autor  +
                ", year=" + year +
                ", genre='" + genre  +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro libro)) return false;
        return Objects.equals(ISBN, libro.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }
}
