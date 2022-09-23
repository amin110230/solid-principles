package com.amin.solid.DependencyInversionPrinciple.smelly;

import com.amin.solid.DependencyInversionPrinciple.smelly.models.Customer;
import com.amin.solid.DependencyInversionPrinciple.smelly.models.ShoppingCart;
import com.amin.solid.DependencyInversionPrinciple.smelly.services.CheckoutService;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Sadman Sobhan", "01711111111");
        ShoppingCart shoppingCart = new ShoppingCart(1200, customer);

        CheckoutService checkoutService = new CheckoutService();
        checkoutService.checkout(shoppingCart);
    }
}
