package com.example.daw_programacion.OOP.Animales;

public class Perro extends Animal{

    private String color;

    public Perro(String nombre, int patas, String color) {
        super(nombre, patas);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void hacerSonido() {
        System.out.println("woof woof");
    }









    // case1: perro and animal both have toString() overrided
/*    @Override
    public String toString() {
        return "Perro{" +
                "tipo='" + tipo + '\'' +
                "} " + super.toString();
    }*/
//    Animal{nombre='animal', patas=10}
//    Perro{tipo='type1'} Animal{nombre='pepe', patas=4}
// however, super.toString() part will print Animal...which is parent class

    // case2. only Animal has toString(), perro did not override
    //then, when we run  System.out.println(perro);
    // we will see Animal() parent class's toSting() executed
    // which means, perro class attributes that Animal class does not have will not be printed.
    // Animal{nombre='pepe', patas=4}



    /*
    // hacerSonido() does not exist
    // then execute the parent(Animal) class hacerSonido()
    // will print "Sonido generico"
    @Override
    public void hacerSonido(){
        System.out.println("woof woof");
    }
*/

}
