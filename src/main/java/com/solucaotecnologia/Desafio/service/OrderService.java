package com.solucaotecnologia.Desafio.service;

import com.solucaotecnologia.Desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;


    public double total(Order order) {
        double freight = shippingService.shipment(order);
        double discount = order.getBasic() * (order.getDiscount() / 100);
        return order.getBasic() - discount + freight;
    }
}
