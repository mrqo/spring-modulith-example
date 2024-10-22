package org.example.ecommmodulith.inventory;

import org.example.ecommmodulith.order.OrderPlacedEvent;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    private InventoryRepository repository;

    @ApplicationModuleListener
    public void handleOrderPlaced(OrderPlacedEvent event) {
        // Business logic to update inventory
        System.out.println("Updating inventory for order ID: " + event.getOrderId());
    }
}