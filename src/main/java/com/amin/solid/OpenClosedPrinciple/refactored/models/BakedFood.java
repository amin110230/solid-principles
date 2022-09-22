package com.amin.solid.OpenClosedPrinciple.refactored.models;

public class BakedFood extends FoodItem {
    public BakedFood(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("---> Baking " + this.getName());
    }
}
