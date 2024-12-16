package com.korkmaz.ecommercebackend.modules.cart.model;

import com.korkmaz.ecommercebackend.modules.user.model.DiscountType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "discounts")
public class Discount {
    @Id
    private String id;
    private String code;
    private DiscountType type;
    private double value;
    private LocalDateTime validFrom;
    private LocalDateTime validTo;
}