package com.amin.solid.OpenClosedPrinciple.refactored;

import com.amin.solid.OpenClosedPrinciple.refactored.models.FoodItem;
import com.amin.solid.OpenClosedPrinciple.refactored.models.FriedFood;
import com.amin.solid.OpenClosedPrinciple.refactored.models.GrilledFood;

import java.util.List;

public class SmellyKitchenService {
    public void prepareItems(List<FoodItem> foodItems) {
        for (final FoodItem foodItem: foodItems) {
            if (foodItem instanceof GrilledFood) {
                System.out.println("---> Grilling " + foodItem.getName());
            }

            if (foodItem instanceof FriedFood) {
                System.out.println("---> Frying " + foodItem.getName());
            }
        }
    }
}