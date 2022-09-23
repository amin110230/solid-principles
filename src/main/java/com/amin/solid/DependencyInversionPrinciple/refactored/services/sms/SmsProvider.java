package com.amin.solid.DependencyInversionPrinciple.refactored.services.sms;

public interface SmsProvider {
    public void sendSms(String text, String phoneNumber);
}
