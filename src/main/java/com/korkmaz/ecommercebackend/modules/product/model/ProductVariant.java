package com.korkmaz.ecommercebackend.modules.product.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "product_variants")
public class ProductVariant {
    @Id
    private String id;
    private String name;
    private double price;
    private int stockQuantity;
    private List<String> imageUrls;
    private List<VariantOption> options; // Örn: Renk, Beden vb.
}