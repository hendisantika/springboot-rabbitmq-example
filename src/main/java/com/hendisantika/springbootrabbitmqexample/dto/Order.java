package com.hendisantika.springbootrabbitmqexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rabbitmq-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 29/09/20
 * Time: 05.31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private String orderId;
    private String name;
    private int qty;
    private double price;
}
