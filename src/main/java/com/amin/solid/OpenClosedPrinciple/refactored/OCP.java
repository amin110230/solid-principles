package com.amin.solid.OpenClosedPrinciple.refactored;

import com.amin.solid.OpenClosedPrinciple.refactored.models.FoodItem;
import com.amin.solid.OpenClosedPrinciple.refactored.models.FriedFood;
import com.amin.solid.OpenClosedPrinciple.refactored.models.GrilledFood;

import java.util.List;

public class OCP {
    public static void main(String[] args) {

        List<FoodItem> foodItems = List.of(
                new GrilledFood("steak"),
                new FriedFood("chicken")
        );

        SmellyKitchenService smellyKitchenService = new SmellyKitchenService();
        System.out.println("Preparing Items:");
        smellyKitchenService.prepareItems(foodItems);
    }
}