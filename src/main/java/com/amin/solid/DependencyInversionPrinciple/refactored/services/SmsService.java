package com.amin.solid.DependencyInversionPrinciple.refactored.services;

import com.amin.solid.DependencyInversionPrinciple.refactored.services.sms.SmsProvider;

public class SmsService {
    private SmsProvider smsProvider;

    public SmsService(SmsProvider smsProvider) {
        this.smsProvider = smsProvider;
    }

    public void sendSms(String text, String phoneNumber) {
        smsProvider.sendSms(text, phoneNumber);
    }
}
