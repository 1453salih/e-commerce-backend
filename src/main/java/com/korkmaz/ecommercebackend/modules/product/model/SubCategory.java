package com.korkmaz.ecommercebackend.modules.product.model;

import org.springframework.data.annotation.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "subcategories")
public class SubCategory {
    @Id
    private String id;
    private String name;
    private String categoryId; // Üst kategorinin ID'si
}
