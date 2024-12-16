package com.korkmaz.ecommercebackend.modules.seller.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "sellers")
public class Seller {
    @Id
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String storeId;
}
