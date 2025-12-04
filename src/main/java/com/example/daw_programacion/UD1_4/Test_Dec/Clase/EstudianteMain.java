package com.example.daw_programacion.UD1_4.Test_Dec.Clase;

import java.util.Scanner;

public class EstudianteMain {
    public static void main(String[] args) {
        String[] nombreArr = {"Alba", "Bea", "Carry", "Dan", "Esther", "Faith", "Gabriel"};

        Scanner sc = new Scanner(System.in);
        int prsenteCount=0 , faltaCount = 0;
        int index = 0;
        String[] presentes = new String[nombreArr.length];
        String[] faltas = new String[nombreArr.length];

/*        while(index < nombreArr.length){
            System.out.println("Un nombre de estudiante: ");
            String inputNombre = sc.nextLine();
            boolean presentBool = false;
            for (int i = 0; i < nombreArr.length; i++) {
                if(nombreArr[i].equals(inputNombre)){
                    System.out.println("Está presenete");
                    presentes[i] = inputNombre;
                    prsenteCount++;
                    presentBool = true;
                }
            }
            if(!presentBool){
                System.out.println("Falta");
                faltas[index] = inputNombre;
            }
            index++;
        }
    */

        //1. Pasar lista de asistencia
        while(index < nombreArr.length){
            for (String nombre : nombreArr) {
                System.out.println(nombre + " está presente?");
                String input = sc.nextLine();
                if(input.equals("s")){
                    presentes[prsenteCount] = nombre;
                    prsenteCount++;
                }else{
                    faltas[faltaCount] = nombre;
                    faltaCount++;
                }
                index++;
            }
        }

        //2. Monstar el resultado de la asistencia
        System.out.println(prsenteCount + " estan presentes. ");
        System.out.println(faltaCount + " estan faltas. ");



        //añade: monstar presentes, faltas lista
/*
        for (int i = 0; i < nombreArr.length; i++) {
            System.out.print(presentes[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < nombreArr.length; i++) {
            System.out.print(faltas[i] + " ");
        }*/

        //3. Agrupar a los estudiantes presentes
        String repetir;
        do{
          int inputNum;
          do{
              System.out.println("Cuantos quieres agroupar a los estudiantes?: ");
              inputNum = Integer.valueOf(sc.nextLine());
              if(faltaCount == nombreArr.length){
                  System.out.println("No hay estudiante presente. ");
                  break;
              }
          }while(inputNum <= 0 || inputNum > prsenteCount);

          int col = inputNum;
          int row;
          if (prsenteCount % inputNum == 0){
              row = prsenteCount / inputNum;
          }else{
              row = (prsenteCount / inputNum) + 1;
          }

          String[][] nombreGroup = new String[row][col];

          int nombreArrIndex = 0;
          int i =0;
          int j = 0;
          while(nombreArrIndex < prsenteCount){
              nombreGroup[i][j] = presentes[nombreArrIndex];
              nombreArrIndex++;
              j++;
              if(j==col){
                  i++;
                  j=0;
              }
          }


          //4. Monstrar los groups formados
          for (int k = 0; k < row; k++) {
              System.out.print("Estudiantes en group " + (k+1) + ": ");
              for (int l = 0; l < col; l++) {
                  System.out.print(nombreGroup[k][l] + " ");
              }
              System.out.println();
          }


          System.out.println("Quieres formar nuevos groupos?");
          repetir = sc.nextLine();

          //5. Repetir el proceso de agroupagión
      }while(repetir.equals("si"));






    }
}
