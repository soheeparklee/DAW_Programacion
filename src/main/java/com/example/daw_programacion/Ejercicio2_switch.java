package com.example.daw_programacion;

public class Ejercicio2_switch {
    public static void main(String[] args) {

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
    }
}
