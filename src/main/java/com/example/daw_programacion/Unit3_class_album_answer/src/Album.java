package com.example.daw_programacion.Unit3_class_album_answer.src;

public class Album {
  private String titulo;
  private String autor;
  private String discografica;
  private int anio;
  private Soporte soporte;
  private int elementos;
  private double precio;
  private Genero genero;
  private boolean esp;

  public Album(String titulo, String autor, String discografica, int anio, Soporte soporte, int elementos, double precio, Genero genero, boolean esp) {
    this.titulo = titulo; 
    this.autor = autor; 
    this.discografica = discografica;
    this.anio = anio;
    this.soporte = soporte;
    this.elementos = elementos;
    this.precio = precio;
    this.genero = genero;
    this.esp = esp;
   }

     public Album(Album a, Soporte soporte) { //❌
    this.titulo = a.getTitulo(); 
    this.autor = a.getAutor(); 
    this.discografica = a.getDiscografica();
    this.anio = a.getAnio();
    this.soporte = soporte; //❌
    this.elementos = a.getElementos();
    this.precio = a.getPrecio();
    this.genero = a.getGenero();
    this.esp = a.getEsp();
   }
   
  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
      
  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setDiscografica(String discografica) {
    this.discografica = discografica;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  public void setSoporte(Soporte soporte) {
    this.soporte = soporte;
  }

  public void setElementos(int elementos) {
    this.elementos = elementos;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  
 
  
  public void setGenero(Genero genero) {
    this.genero = genero;
  }

  public void setEsp(boolean esp) {
    this.esp = esp;
  }

  public String getTitulo() {
    return titulo;
  }
      
  public String getAutor() {
    return autor;
  }

  public String getDiscografica() {
    return discografica;
  }

  public int getAnio() {
    return anio;
  }

  public Soporte getSoporte() {
    return soporte;
  }

  public int getElementos() {
    return elementos;
  }

  public double getPrecio() {
    return precio;
  }
    //❌
 public double getPrecio(double iva) {
    return precio*iva;
  }
  public Genero getGenero() {
    return genero;
  }

  public boolean getEsp() {
    return esp;
  }


    //❌
  
  public String devuelveStringSoporte()
  { String s = null;
    switch(soporte)
    {
        case DISCO: s = "Disco"; break;
        case DVD: s = "DVD"; break;
        case CD: s = "CD";
    }
    return s;
  }


    //❌
    public String devuelveStringGenero()
  { String s = null;
    switch(genero)
    {
        case DANCE: s = "Dance"; break;
        case POP: s = "Pop"; break;
        case ROCK: s = "Rock";
    }
    return s;
  }

    @Override
    public String toString() {
        return "Album{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", discografica='" + discografica + '\'' +
                ", anio=" + anio +
                ", soporte=" + soporte +
                ", elementos=" + elementos +
                ", precio=" + precio +
                ", genero=" + genero +
                ", esp=" + esp +
                '}';
    }

    //❌ why need equals?

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return (titulo.equals(album.titulo) && autor.equals(album.autor));
  }


}
