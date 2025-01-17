package com.korkmaz.ecommercebackend.modules.product.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "categories")
public class Category {
    @Id
    private String id;
    private String name;
    @DBRef
    private List<SubCategory> subCategories;
}
