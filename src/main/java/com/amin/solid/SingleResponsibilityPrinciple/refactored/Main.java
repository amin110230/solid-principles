package com.amin.solid.SingleResponsibilityPrinciple.refactored;

import com.amin.solid.SingleResponsibilityPrinciple.refactored.services.ItemPriceCalculationService;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Item book = new Item("Java Programming", 100.0);
        Item whiteBoard = new Item("White Board", 400.0);
        Item markerPen = new Item("Marker Pen", 40.0);

        int numberOfPlasticBags = 2;
        int tax = 10;
        var itemsPurchased = List.of(book, whiteBoard, markerPen);

        ItemPriceCalculationService itemPriceCalculationService = new ItemPriceCalculationService();
        double totalPriceOfItems = itemPriceCalculationService.getTotalItemPrice(itemsPurchased,
                numberOfPlasticBags, tax);

        System.out.println("Total Prices of items purchased : " + totalPriceOfItems);

    }
}