package com.solucaotecnologia.Desafio.service;

import com.solucaotecnologia.Desafio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {



    public double shipment(Order order) {
        double valueBasic = order.getBasic();
        if (valueBasic < 100.0) {
            return 20.0;
        } else if (valueBasic < 200.0) {
            return 12.0;
        }

        return 0.0;
    }
}
