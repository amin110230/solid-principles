package com.amin.solid.SingleResponsibilityPrinciple.refactored.services;

import com.amin.solid.SingleResponsibilityPrinciple.refactored.Item;
import com.amin.solid.SingleResponsibilityPrinciple.refactored.logger.Logger;

import java.util.List;

public class ItemPriceCalculationService {

    private double plasticBagPrice = 5.0;
    private final TaxCalculationService taxCalculationService = new TaxCalculationService();

    public double getItemPrices(List<Item> items) {
        return items
                .stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }

    public void getPlasticBagPrice(int totalItems) {
        if (totalItems > 2) {
            plasticBagPrice = plasticBagPrice * 0.5;
            Logger.info("More than 2 items purchased. Reducing plastic bag price");
        }
    }

    public double getTotalItemPrice(List<Item> items, int numberOfPlasticBag, int tax) {
        int totalItems = items.size();

        double itemPrices = getItemPrices(items);
        getPlasticBagPrice(totalItems);
        double taxAmount = taxCalculationService.getTaxAmount(itemPrices, tax);

        double totalPrice = itemPrices + taxAmount + numberOfPlasticBag * plasticBagPrice;
        Logger.info("Total Price of the items -> " + totalPrice);
        return totalPrice;
    }
}
