package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderProcessor {
    private OrderInformationService orderInformationService;
    private OrderServiceProcessor orderServiceProcessor;
    private OrderRepositoryProcessor orderRepositoryProcessor;
    Order order;

    public OrderProcessor(OrderInformationService orderInformationService, OrderServiceProcessor orderServiceProcessor, OrderRepositoryProcessor orderRepositoryProcessor) {
        this.orderInformationService = orderInformationService;
        this.orderServiceProcessor = orderServiceProcessor;
        this.orderRepositoryProcessor = orderRepositoryProcessor;
    }
    public OrderDto process(final String user, final String item, final int itemQty, final String orderAdress) {
        Order order = new Order(user, item, itemQty, orderAdress);
        boolean isOrderConfirmed = orderServiceProcessor.createOrder(order);

                if (isOrderConfirmed) {
                    orderInformationService.sendConfirmation(order);
                    orderRepositoryProcessor.sendOrder(order);
                    return new OrderDto(order, true);
                } else {
                    return new OrderDto(order, false);
                }
    }
}