package com.amin.solid.DependencyInversionPrinciple.refactored;

import com.amin.solid.DependencyInversionPrinciple.refactored.models.Customer;
import com.amin.solid.DependencyInversionPrinciple.refactored.models.ShoppingCart;
import com.amin.solid.DependencyInversionPrinciple.refactored.services.CheckoutService;
import com.amin.solid.DependencyInversionPrinciple.refactored.services.SmsService;
import com.amin.solid.DependencyInversionPrinciple.refactored.services.sms.BanglalinkSmsProvider;
import com.amin.solid.DependencyInversionPrinciple.refactored.services.sms.GpSmsProvider;
import com.amin.solid.DependencyInversionPrinciple.refactored.services.sms.SmsProvider;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Sadman Sobhan", "01711111111");
        ShoppingCart shoppingCart = new ShoppingCart(1200, customer);

//        SmsProvider smsProvider = new GpSmsProvider();
        SmsProvider smsProvider = new BanglalinkSmsProvider();
        SmsService smsService = new SmsService(smsProvider);
        CheckoutService checkoutService = new CheckoutService(smsService);
        checkoutService.checkout(shoppingCart);
    }
}
