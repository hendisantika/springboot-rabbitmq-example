package com.hendisantika.springbootrabbitmqexample.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hendisantika.springbootrabbitmqexample.dto.Corporation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

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
@Slf4j
@RestController
@EnableBinding(Source.class)
@RequiredArgsConstructor
public class MsgController {

    private final Source source;

    @PostMapping(value = "/get-details")
    public String sendMessage(@RequestBody String payload) throws IOException {
        ObjectMapper ob = new ObjectMapper();
        Corporation corporation = null;
        try {
            corporation = ob.readValue(payload, Corporation.class);
        } catch (Exception ex) {
            log.info(String.valueOf(ex));
        }
        source.output().send(MessageBuilder.withPayload(corporation).setHeader("myheader", "myheaderValue").build());
        log.info("success");
        return "Message sent to RabbitMQ";
    }
}
