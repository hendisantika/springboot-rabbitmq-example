package com.hendisantika.springbootrabbitmqexample.service;

import com.hendisantika.springbootrabbitmqexample.dto.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rabbitmq-example
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/4/22
 * Time: 17:57
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class RabbitMqService {
    private final AmqpTemplate amqpTemplate;

    private final String EXCHANGE = "otp-exchange";

    private final String ROUTING_KEY = "items";

    public void sendMessage(Item item) {
        amqpTemplate.convertAndSend(EXCHANGE, ROUTING_KEY, item);
    }
}
