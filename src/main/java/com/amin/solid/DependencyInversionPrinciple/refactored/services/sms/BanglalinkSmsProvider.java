package com.amin.solid.DependencyInversionPrinciple.refactored.services.sms;

public class BanglalinkSmsProvider implements SmsProvider{
    @Override
    public void sendSms(String text, String phoneNumber) {
        System.out.println("Sending SMS via Banglalink Provider:");
        System.out.println("---->BL Receiver: " + phoneNumber);
        System.out.println("---->BL Text:\n" + text);
    }
}
