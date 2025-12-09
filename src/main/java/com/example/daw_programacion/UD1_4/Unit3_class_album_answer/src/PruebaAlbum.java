package com.example.daw_programacion.UD1_4.Unit3_class_album_answer.src;

public class PruebaAlbum {
  public static void main(String[] args) {
    Album album1;
    Album album2;

    album1 = new Album("Crazy Hits","Crazy Frog","Blanco y Negro",2005,Soporte.CD,1,14.99,Genero.DANCE,false);
    album2 = new Album("Cien gaviotas donde iran","Varios","DRO East West",2005,Soporte.CD,1,14.99,Genero.POP,true);

    System.out.println(album1);
    System.out.println(album2);
    //COSTE ALBUM 1 SIN IVA
    System.out.println("Precio total (sin IVA): " + album1.getPrecio() + " euros.");
    //COSTE DEL ALBUM 1 CON IVA REDUCIDO 10%
    System.out.println("Precio total (con 10% IVA): " + album1.getPrecio(10) + " euros.");
    
    // Uso de constructor copia
    Album album3 = new Album(album1,Soporte.DVD);
    System.out.println(album3);

    

  }
}
