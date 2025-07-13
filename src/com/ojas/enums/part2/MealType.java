package com.ojas.enums.part2;

public enum MealType {
    BREAKFAST("Breakfast", "8 am - 11 am"),
    LUNCH("Lunch", "12 pm - 3 pm"),
    DINNER("Dinner", "7 pm - 10 pm"),
    DESSERT("Desserts", "10 pm - 11 pm");

    private String mealType;
    private String mealTimeRange;

    public String getMealType() {
        return mealType;
    }

    public String getMealTimeRange() {
        return mealTimeRange;
    }

    MealType(String mealType, String timeRange) {
        this.mealType = mealType;
        this.mealTimeRange = timeRange;
    }

    public void displayInfo(){
        System.out.println("The meal is: " + this.mealType + " with meal-time: " + this.mealTimeRange);
    }

}
