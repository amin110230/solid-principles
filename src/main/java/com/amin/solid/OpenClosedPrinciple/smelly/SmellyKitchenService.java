package com.amin.solid.OpenClosedPrinciple.smelly;

import com.amin.solid.OpenClosedPrinciple.smelly.models.FoodItem;
import com.amin.solid.OpenClosedPrinciple.smelly.models.FriedFood;
import com.amin.solid.OpenClosedPrinciple.smelly.models.GrilledFood;

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
