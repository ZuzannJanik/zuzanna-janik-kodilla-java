package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderApplication {
    public static void main(String[] args) {
        OrderInformationService orderInformationService = new OrderInformationService();
        OrderServiceProcessor orderServiceProcessor = new OrderServiceProcessor();
        OrderRepositoryProcessor orderRepositoryProcessor = new OrderRepositoryProcessor();

        OrderProcessor orderProcessor = new OrderProcessor(orderInformationService, orderServiceProcessor, orderRepositoryProcessor);

        orderProcessor.process("John Wick", "Gun", 2, "New York");
    }
}
