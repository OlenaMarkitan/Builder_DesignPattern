package com.marlen.java.lesson_1.Lesson7_1.Home7.e_olymp.DesignPatterns.Creational_Patterns.Builder.Builder_tutorialpoints;

// https://www.tutorialspoint.com/design_pattern/builder_pattern.htm

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
