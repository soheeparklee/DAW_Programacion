package com.example.daw_programacion.OOP.Animales;

import java.util.ArrayList;

public class AnimalMain {
    public static void main(String[] args) {
        Animal perroAnimal = new Perro("PerroNombre1", 4, "white");
        Animal gatoAnimal = new Gato("GatoNombre2", 4);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(perroAnimal);
        animalList.add(gatoAnimal);

        for (Animal animal : animalList) {
            if(animal instanceof Perro){ //이 동물이 강아지인지 알기 위해서
                Perro p = (Perro) animal; //downcasting
                System.out.println(p.getColor());
            }
        }


        for (Animal animal : animalList) {
            animal.hacerSonido();
        }
//        woof woof
//        meow


        //perroAnimal.hacerSonido(); //woof woof
        //gatoAnimal.hacerSonido(); //meow
        //override한 메소드로 실행이 된다

        Perro perro = new Perro("PerroNombre1", 4, "brown");
        Animal animal = perro;




        //If I want to guargar both perro and gato en un ArrayList?
        //ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(perroAnimal);
        animalList.add(gatoAnimal);

        System.out.println(animalList);
        // 결과
        // [Animal{nombre='PerroNombre1', patas=4}, Animal{nombre='GatoNombre2', patas=4}]




        // Uso
        //Animal animal = new Perro("PerroNombre1", 4, "brown");

        //can I get attribute of perro (color)?
        //NO
        animal.getNombre();
        animal.getPatas();
        //animal.getColor(); 존재하지 않음
        // ➡️ 부모는 자식의 attribute를 모른다


        // ➡️ 자식은 부모의 attribute을 안다
        Perro p = new Perro("PerroNombre2", 4, "brown");
        p.getNombre();
        p.getPatas();
        p.getColor();





    }
}
