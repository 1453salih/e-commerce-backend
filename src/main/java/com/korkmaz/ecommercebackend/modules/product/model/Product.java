package com.korkmaz.ecommercebackend.modules.product.model;

import com.korkmaz.ecommercebackend.modules.seller.model.Seller;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "products")
public class Product {
    @Id
    private String id;
    private String name;
    private String description;

    @DBRef
    private Category category;

    @DBRef
    private SubCategory subCategory;

    @DBRef
    private List<ProductVariant> variants;

    @DBRef
    private Seller seller;

    private boolean isAvailable;
    private List<String> tags;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}