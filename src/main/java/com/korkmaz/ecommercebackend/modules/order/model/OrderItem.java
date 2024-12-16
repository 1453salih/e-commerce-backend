package com.korkmaz.ecommercebackend.modules.order.model;

import com.korkmaz.ecommercebackend.modules.product.model.Product;
import com.korkmaz.ecommercebackend.modules.product.model.ProductVariant;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "order_items")
public class OrderItem {
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
}