package com.amin.solid.OpenClosedPrinciple.refactored;

import com.amin.solid.OpenClosedPrinciple.refactored.models.FoodItem;

import java.util.List;

public class DecentKitchenService {
    public void prepareItems(List<FoodItem> foodItems) {
//        for (final FoodItem foodItem: foodItems) {
//            foodItem.prepare();
//        }
        foodItems.forEach(FoodPreparer::prepare);
    }
}