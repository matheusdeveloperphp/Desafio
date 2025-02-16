package com.solucaotecnologia.Desafio;

import com.solucaotecnologia.Desafio.entities.Order;
import com.solucaotecnologia.Desafio.service.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.sql.SQLOutput;
import java.util.Locale;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

    @Autowired
    ShippingService shippingService;

    public static void main(String[] args)
    {
        SpringApplication.run(DesafioApplication.class, args);
    }




    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(1309, 95.90, 0.00);

        System.out.println("Pedido código " + order.getCode());
        System.out.printf("Valor total: R$ %.2f%n", shippingService.shipment(order));

    }
}
