package com.example.daw_programacion.UD1_4.Unit3_class_ejercicio_2;

public class E3_Producto {
    String nombre;
    String categoría;
    int precio;

    public E3_Producto(String nombre, String caragoría, int precio) {
        this.nombre = nombre;
        this.categoría = caragoría;
        this.precio = precio;
    }

    public E3_Producto(String nombre, String categoría){
        this(nombre, categoría, 100);
    }

    public void showProductDetail(){
        System.out.println(" nombre: " + nombre + " categoría " + categoría + " precio " + precio);
    }
    public void bajarPrecio(int menos){
        this.precio -= menos;
    }
    public void subirPrecio(int mas){
        this.precio += mas;
    }
    public int añadirDosPrecios(E3_Producto otroProducto){
        return this.precio + otroProducto.precio;
    }
}
