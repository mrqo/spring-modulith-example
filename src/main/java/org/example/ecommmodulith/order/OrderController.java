package org.example.ecommmodulith.order;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/placeOrder")
    public String placeOrder(@RequestParam Long orderId) {
        orderService.placeOrder(orderId);
        return "Order placed successfully!";
    }
}