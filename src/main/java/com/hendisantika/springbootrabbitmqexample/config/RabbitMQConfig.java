package com.hendisantika.springbootrabbitmqexample.config;

import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rabbitmq-example
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/4/22
 * Time: 17:54
 * To change this template use File | Settings | File Templates.
 */
@Configuration
public class RabbitMQConfig {

    private final String QUEUE = "items-queue";

    private final String EXCHANGE = "otp-exchange";

}
