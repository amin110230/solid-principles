package com.amin.solid.OpenClosedPrinciple.smelly.models;

public abstract class FoodItem {
    private String name;

    public FoodItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
