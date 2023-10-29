package com.example.consumidorestoque.consumer;

import DTO.EstoqueDTO;
import constantes.RabbitMQConstantes;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EstoqueConsumer {

    @RabbitListener(queues = RabbitMQConstantes.FILA_ESTOQUE)
    private void consumidor(EstoqueDTO estoqueDTO){
        System.out.println(estoqueDTO.codigoProduto);
        System.out.println(estoqueDTO.quantidade);
        System.out.println("---------------------------------");

    }
}
