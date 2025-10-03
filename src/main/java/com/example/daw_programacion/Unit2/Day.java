package com.example.daw_programacion.Unit2;

public enum Day {
    SUNDAY(0),
    MONDAY(10),
    TUESDAY(20),
    WEDNESDAY(30),
    THURSDAY(40),
    FRIDAY(50),
    SATURDAY(60);

    private final int dayValue;

    Day(int dayValue){
        this.dayValue = dayValue;
    }

    public int getDayValue() {
        return dayValue;
    }
}
