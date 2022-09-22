package com.amin.solid.OpenClosedPrinciple.refactored.models;

import com.amin.solid.OpenClosedPrinciple.refactored.FoodPreparer;

public abstract class FoodItem implements FoodPreparer {
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

//    abstract void prepareFood();

/*    Q: why not abstract method in abstract class instead of interface?
      Exp: it will be implementation of hierarchical based open closed principle [anti pattern],
      instead of implementation super class method, extends of interface will be preferable,
      composition over inheritance */
}
