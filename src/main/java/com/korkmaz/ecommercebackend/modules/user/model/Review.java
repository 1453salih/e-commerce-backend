package com.korkmaz.ecommercebackend.modules.user.model;

import org.springframework.data.annotation.Id;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "reviews")
public class Review {
    @Id
    private String id;
    private String productId;
    private String userId;
    private int rating;
    private String comment;
    private LocalDateTime reviewDate;
}