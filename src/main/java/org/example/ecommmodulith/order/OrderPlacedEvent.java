package org.example.ecommmodulith.order;

public class OrderPlacedEvent {
    private final Long orderId;

    public OrderPlacedEvent(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }
}