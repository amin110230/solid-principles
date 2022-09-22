package com.amin.solid.OpenClosedPrinciple.refactored;

import com.amin.solid.OpenClosedPrinciple.refactored.models.*;

import java.util.List;

public class OCP {
    public static void main(String[] args) {

        List<FoodItem> foodItems = List.of(
                new GrilledFood("steak"),
                new FriedFood("chicken"),
                new BakedFood("pasta"),
                new SauteedFood("mashroom")
        );

        DecentKitchenService decentKitchenService = new DecentKitchenService();
        System.out.println("Preparing Items:");
        decentKitchenService.prepareItems(foodItems);
    }
}