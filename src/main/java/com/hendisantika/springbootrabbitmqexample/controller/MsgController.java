package com.hendisantika.springbootrabbitmqexample.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rabbitmq-example
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/4/22
 * Time: 15:10
 * To change this template use File | Settings | File Templates.
 */
@RestController
@EnableBinding(Source.class)
@RequiredArgsConstructor
public class MsgController {

    private final Source source;
}
