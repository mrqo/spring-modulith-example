package org.example.ecommmodulith.user;

import org.example.ecommmodulith.order.OrderPlacedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @EventListener
    public void handleOrderPlaced(OrderPlacedEvent event) {
        // Business logic to notify the user
        System.out.println("Notifying user about order ID: " + event.getOrderId());
    }
}