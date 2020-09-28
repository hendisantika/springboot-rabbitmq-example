package com.hendisantika.springbootrabbitmqexample.consumer;

import com.hendisantika.springbootrabbitmqexample.config.MessagingConfig;
import com.hendisantika.springbootrabbitmqexample.dto.OrderStatus;
import lombok.extern.log4j.Log4j2;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rabbitmq-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/09/20
 * Time: 05.31
 */
@Component
@Log4j2
public class User {

    @RabbitListener(queues = MessagingConfig.QUEUE)
    public void consumeMessageFromQueue(OrderStatus orderStatus) {
        log.info("Message recieved from queue : " + orderStatus);
    }
}
