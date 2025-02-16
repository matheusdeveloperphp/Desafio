package com.solucaotecnologia.Desafio.service;

import com.solucaotecnologia.Desafio.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {


    public double total(Order order, double discountedPrice) {

        // Se o valor com desconto for menor que 100, adiciona 20.0
        if (discountedPrice < 100) {
            return discountedPrice + 20.0;
        }
        // Se o valor com desconto for entre 100 e 200, adiciona 12.0
        else if (discountedPrice >= 100 && discountedPrice <= 200) {
            return discountedPrice + 12.0;
        }
        // Se o valor for maior que 200, retorna o valor sem alterações (caso queira um comportamento diferente, adicione uma lógica aqui)
        else {
            return discountedPrice;
        }
    }

}
