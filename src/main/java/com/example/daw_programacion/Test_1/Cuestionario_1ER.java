package com.example.daw_programacion.Test_1;

public class Cuestionario_1ER {

    public static void main(String[] args) {


/*

        int iLitro = 10;
        double dLitro = iLitro;
        System.out.println(dLitro);

        double ddLitro = 10.0;
        int iiLitro = (int) ddLitro; //casting

*/

        //primitive copy value
/*
        int a = 10;
        int b = changeNum(a);

        System.out.println(a); //10
        System.out.println(b); //20

*/


        Student studentA = new Student(10);
        Student studentB = studentA;
        Student studentC = new Student(studentA);

        studentA.setAge(20);
        System.out.println(studentA.getAge()); //20
        System.out.println(studentB.getAge()); //20
        System.out.println(studentC.getAge()); //10

        studentB.setAge(30);
        System.out.println(studentA.getAge()); //30
        System.out.println(studentB.getAge()); //30
        System.out.println(studentC.getAge()); //10

        // method에 class instance(copy reference)를 parameter로 넘기면
        // instance의 attribute는 바뀔까?
        changeAge(studentC);
        System.out.println(studentC.getAge()); //11

        changeAgeReturn(studentC);
        System.out.println(studentC.getAge()); //12
        int age = changeAgeReturn(studentC);
        System.out.println(age); //13
        System.out.println(studentA.getAge()); //30


    }

    public static void changeAge(Student student){
        student.setAge(student.getAge() + 1);
    }

    public static int changeAgeReturn(Student student){
        student.setAge(student.getAge() + 1);
        return student.getAge();
    }
    public static int changeNum(int i){
        return i+10;
    }
}
