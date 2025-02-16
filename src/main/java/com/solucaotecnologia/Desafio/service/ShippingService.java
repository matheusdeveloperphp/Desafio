package com.solucaotecnologia.Desafio.service;

import com.solucaotecnologia.Desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    @Autowired
    private final OrderService orderService;


    public ShippingService(OrderService orderService) {
        this.orderService = orderService;
    }

    public double shipment(Order order) {

        double discountedPrice = order.getBasic() - (order.getBasic() * order.getDiscount());
        return orderService.total(order, discountedPrice);


    }
}
