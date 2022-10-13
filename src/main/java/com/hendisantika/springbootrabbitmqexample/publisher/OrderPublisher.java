package com.hendisantika.springbootrabbitmqexample.publisher;

import com.hendisantika.springbootrabbitmqexample.config.MessagingConfig;
import com.hendisantika.springbootrabbitmqexample.dto.Order;
import com.hendisantika.springbootrabbitmqexample.dto.OrderStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rabbitmq-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/09/20
 * Time: 05.33
 */
@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderPublisher {

    private final AmqpTemplate amqpTemplate;

    @PostMapping("/{restaurantName}")
    public String bookOrder(@RequestBody Order order, @PathVariable String restaurantName) {
        order.setOrderId(UUID.randomUUID().toString());
        //restaurantservice
        //payment service
        OrderStatus orderStatus = new OrderStatus(order, "PROCESS", "order placed successfully in " + restaurantName);
        amqpTemplate.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, orderStatus);
        return "Success !!";
    }
}
