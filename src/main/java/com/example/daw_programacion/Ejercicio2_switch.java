package com.example.daw_programacion;

import java.lang.annotation.Target;
import java.util.Scanner;

public class Ejercicio2_switch {
    public static void main(String[] args) {
        //1. Switch
        /*
        Day today = Day.WEDNESDAY; //enum class.value
        int dayValue = Day.WEDNESDAY.getDayValue();

        switch(today){
            case SUNDAY :
                System.out.println("today is Sun" + dayValue);
                break;
            case MONDAY:
                System.out.println("today is Mon"+ dayValue);
                break;
            case TUESDAY:
                System.out.println("today is Tues"+ dayValue);
                break;
            case WEDNESDAY:
                System.out.println("today is Wed"+ dayValue);
                break;
            case THURSDAY:
                System.out.println("today is Thu"+ dayValue);
                break;
            case FRIDAY:
                System.out.println("today is Fri"+ dayValue);
                break;
            case SATURDAY:
                System.out.println("today is Sat"+ dayValue);
                break;
            default:
                System.out.println("This is not a day of the week");
                break;
        }
*/

        //2. Several cases of switch
/*        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();

        Day[] days = Day.values();
        for(int i=0; i<days.length; i++){
            if(days[i].equals(input)) throw new IllegalStateException();
        }

        Day today = Day.valueOf(input);
        int dayValue = today.getDayValue();

        switch(today){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println("today is working day " + dayValue);
                break;
            case SATURDAY, SUNDAY:
                System.out.println("today is weekend " + dayValue);
                break;
            default:
                System.out.println("This is not a day of the week");
                break;
        }
        */

        //3. Switch yield
        int day = 3;
        String dayName = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> {
                System.out.println("Processing day 3");
                yield "Wednesday";
            }
            case 4 -> "Thursday";
            default -> "Unknown day";
        };

        System.out.println("Day is " + dayName);

    }
}
