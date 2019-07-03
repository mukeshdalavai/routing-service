package com.stackroute.service.rabbitMQservice;

import com.stackroute.domain.Charity;
import com.stackroute.domain.DeliveryBoy;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SendOutput {

    @Autowired
    public RabbitTemplate rabbitTemplate;

    @Value("${restaurant.rabbitmq.exchange}")
    private String restaurantExchange;

    @Value("${restaurantLogs.rabbitmq.routingkey}")
    private String restaurantRoutingkey;

    @Value("${charity.rabbitmq.exchange}")
    private String charityExchange;

    @Value("${charityLogs.rabbitmq.routingkey}")
    private String charityRoutingkey;

    @Value("${deliveryBoy.rabbitmq.exchange}")
    private String deliveryBoyExchange;

    @Value("${deliveryBoyLogs.rabbitmq.routingkey}")
    private String deliveryBoyRoutingkey;

    public void send(List<DeliveryBoy> deliveryBoys, List<Charity> charities) {
        System.out.println("inside send");
        rabbitTemplate.convertAndSend(restaurantExchange, restaurantRoutingkey, deliveryBoys);
        rabbitTemplate.convertAndSend(charityExchange, charityRoutingkey, charities);
        rabbitTemplate.convertAndSend(deliveryBoyExchange, deliveryBoyRoutingkey, deliveryBoys);
        System.out.println("Send msg = " + deliveryBoys);
    }
}