package com.amin.solid.OpenClosedPrinciple.refactored.models;

public class FriedFood extends FoodItem {
    public FriedFood(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("---> Frying " + this.getName());
    }
}

