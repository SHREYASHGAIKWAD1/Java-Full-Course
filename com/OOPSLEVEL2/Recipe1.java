package com.OOPSLEVEL2;

public class Recipe1 extends AbstractRecipe {

    @Override
    void prepare() {
        System.out.println("Step 1: Get the raw materials." + "\n" + "Get the utensils." + "\n");
    }

    @Override
    void makeDish() {
        System.out.println("Step 2: Make the dish using the recipe." + "\n");
    }

    @Override
    void cleanUp() {
        System.out.println("Step 3: Clean the utensils" + "\n");
    }
}
