package com.example.daw_programacion.Collections.ejercicioFeb.Ej18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //1. Pila de libros inicial
        Stack<Libro> pilaLibros = new Stack<>();
        pilaLibros.push(new Libro("978-261-04", "El Hobbit",  "J.R.R. Tolkien", 1937, "Fantasía"));
        pilaLibros.push(new Libro("978-261-03", "El Señor de los Anillos: El Retorno del Rey",  "J.R.R. Tolkien", 1955, "Fantasía"));
        pilaLibros.push(new Libro("978-261-01", "El Señor de los Anillos: La Comunidad del Anillo",  "J.R.R. Tolkien", 1954, "Fantasía"));
        pilaLibros.push(new Libro("978-261-02", "El Señor de los Anillos: Las Dos Torres",  "So Hee Park", 1937, "Fantasía"));
        pilaLibros.push(new Libro("978-677-02", "Fundación",  "Isaac Asimov Espanol", 1951, "Ciencia Ficción"));
        pilaLibros.push(new Libro("978-677-02", "Foundation",  "Isaac Asimov English", 1951, "English Ciencia Ficción"));


        //2. Procesamiento y Creaxion del Catalogo
        ArrayList<Libro> catalogo = new ArrayList<>();
        while(!pilaLibros.isEmpty()){
            Libro popped = pilaLibros.pop();
            if(!catalogo.contains(popped)){
                catalogo.add(popped);
            }
        }

        //3. Ordenación del Catálogo
        System.out.println("-----Catalogo ordenado-----");
        Collections.sort(catalogo, new TitleComparator());

        //4. Recorrido del Catálogo:
        recorrido(catalogo);

        //5. Información de Autores
        System.out.println("-----Informacion de Autores-----");
        HashMap<String, String> autorMap = new HashMap<>();
        for (Libro libro : catalogo) {
            String autor = libro.getAutor();
            if(!autorMap.containsKey(autor)){
                autorMap.put(autor, libro.getGenre());
            }
        }

        Set<Map.Entry<String, String>> entries = autorMap.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("Autor: " + entry.getKey() + " -> " + entry.getValue());
        }

        //6. Registro de Categorías
        System.out.println("------Categorias Registradas------");
        HashSet<String> categoriaSet = new HashSet<>();
        for (Libro libro : catalogo) {
            categoriaSet.add(libro.getGenre());
        }

        for (String s : categoriaSet) {
            System.out.println(s);
        }

    }

    public static void recorrido(ArrayList<Libro> catalogo) {
        for (Libro libro : catalogo) {
            System.out.println(libro.toString());
        }
    }
}
