package com.ojas.enums.part1;

public class Main {
    public static void main(String[] args) {
//        System.out.println(DayClass.SUNDAY);
//        System.out.println(DayClass.MONDAY);
//        System.out.println(DayClass.WEDNESDAY);
//        System.out.println(DayClass.SUNDAY);
//        System.out.println(DayClass.FRIDAY);
//        System.out.println(DayClass.SATURDAY);

//        System.out.println(Day.SUNDAY);
//        Day monday = Day.MONDAY;

        // meaning every constant that we have defined in the
        // enum is a final instance of the Day type class

//        int ordinal = monday.ordinal();
//        System.out.println(ordinal); // ordinal is nothing but the index of the instance
//
//        String name = monday.name(); // returns the string value of the constants
//        System.out.println(name);


//        Day[] values = Day.values();
//        for (Day element : values){
//            System.out.println(element);
//        }
//
//
//        System.out.println(Day.MONDAY.display());

        Day monday = Day.MONDAY;
//        System.out.println(monday.getLower());

        String result = switch (monday){
            case MONDAY -> "Monday hai aaz...";
            case TUESDAY -> "Tuesday hai aaz...";
            default -> "Oye Weekend hai aaz...mazeeee karooo";
        };
        System.out.println(result);

    }
}
