package org.example.ecommmodulith.order;

import jakarta.transaction.Transactional;
import org.example.ecommmodulith.inventory.InventoryService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final ApplicationEventPublisher eventPublisher;

    public OrderService(ApplicationEventPublisher eventPublisher) {
        this.eventPublisher = eventPublisher;
    }

    @Transactional
    public void placeOrder(Long orderId) {
        // Business logic for placing an order
        System.out.println("Order placed with ID: " + orderId);
        OrderPlacedEvent event = new OrderPlacedEvent(orderId);

        // Publish the event
        eventPublisher.publishEvent(event);

        // Eew, what's that brother?
//        InventoryService inventoryService = new InventoryService();
//        inventoryService.handleOrderPlaced(event);
    }
}