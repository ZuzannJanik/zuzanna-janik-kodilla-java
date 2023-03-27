package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderInformationService implements InformationService {
    public void sendConfirmation(Order order) {
        System.out.println("Sms is sent to: " + order.getUser());
    }
}

