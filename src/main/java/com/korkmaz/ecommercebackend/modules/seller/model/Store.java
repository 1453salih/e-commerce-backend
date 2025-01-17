package com.korkmaz.ecommercebackend.modules.seller.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "stores")
public class Store {
    @Id
    private String id;
    private String name;
    private String description;
    private String addressId;
    private String sellerId;
}
