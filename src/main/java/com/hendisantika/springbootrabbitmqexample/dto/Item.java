package com.hendisantika.springbootrabbitmqexample.dto;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-rabbitmq-example
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 8/4/22
 * Time: 17:53
 * To change this template use File | Settings | File Templates.
 */
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Item.class)
@Data
@NoArgsConstructor
public class Item {
    private String itemName;
    private String category;
    private String description;
}
