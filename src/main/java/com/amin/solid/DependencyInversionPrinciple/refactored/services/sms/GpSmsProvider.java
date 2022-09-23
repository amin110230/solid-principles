package com.amin.solid.DependencyInversionPrinciple.refactored.services.sms;

public class GpSmsProvider implements SmsProvider{
    @Override
    public void sendSms(String text, String phoneNumber) {
        System.out.println("Sending SMS via GP Provider:");
        System.out.println("---->GP Receiver: " + phoneNumber);
        System.out.println("---->GP Text:\n" + text);
    }
}
