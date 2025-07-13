package com.ojas.enums.part1;

public enum Day {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String lower;

    public String getLower() {
        return lower;
    }

    Day(String lower) { // custom constructor for enums
        System.out.println("Custom constructor called!");
        this.lower = lower;
    }

    public String display(){
        return "Today is " + this.name();
    }
}
