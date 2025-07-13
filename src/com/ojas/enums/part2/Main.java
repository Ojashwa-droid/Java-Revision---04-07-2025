package com.ojas.enums.part2;

public class Main {
    public static void main(String[] args) {
        MealType breakfast = MealType.BREAKFAST;
        breakfast.displayInfo();

        MealType[] mealTypes = MealType.values();

        for (MealType mealType: mealTypes){
            System.out.println("Meal-type is " + mealType.getMealType() +
                    " and meal-time range is " +
                    mealType.getMealTimeRange() );
        }

    }
}
