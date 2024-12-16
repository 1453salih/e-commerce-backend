package com.korkmaz.ecommercebackend.modules.cart.model;

import com.korkmaz.ecommercebackend.modules.user.model.Discount;
import com.korkmaz.ecommercebackend.modules.user.model.User;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "carts")
public class Cart {
    @Id
    private String id;

    @DBRef
    private User user;

    @DBRef
    private List<CartItem> items;

    private CartPricing pricing;

    private CartStatus status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @DBRef
    private List<Discount> appliedDiscounts;

    // Constructor
    public Cart() {
        this.createdAt = LocalDateTime.now();
        this.status = CartStatus.ACTIVE;
    }
}