package com.korkmaz.ecommercebackend.modules.cart.model;



import com.korkmaz.ecommercebackend.modules.product.model.Product;
import com.korkmaz.ecommercebackend.modules.product.model.ProductVariant;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "cart_items")
public class CartItem {
    @Id
    private String id;

    @DBRef
    private Product product;

    @DBRef
    private ProductVariant productVariant;

    private int quantity;
    private double unitPrice;
    private double subtotal;

    private List<String> selectedOptions;

    private LocalDateTime addedAt;
}