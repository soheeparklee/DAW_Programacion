package com.example.daw_programacion.Test_1;

public class Student {
    private int age;
    private int grade;

    public Student(Student student){
        this.age = student.age;
    }

    public Student(int age) {
        this.age = age;
    }

//    public Student(int age, int grade) {
//        this(0); // call the other constructor with a default age
//        this.grade = grade;
//    }


    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }
}
