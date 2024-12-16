package com.korkmaz.ecommercebackend.modules.product.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "variant_options")
public class VariantOption {
    @Id
    private String id;
    private String optionType; // "Renk", "Beden"
    private String value; // "Kırmızı", "Large"
}