package com.amin.solid.OpenClosedPrinciple.refactored.models;

import com.amin.solid.OpenClosedPrinciple.refactored.FoodPreparer;

public class SauteedFood extends FoodItem implements FoodPreparer {
    public SauteedFood(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("---> Sauteeing " + this.getName());
    }
}
