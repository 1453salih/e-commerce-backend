package com.korkmaz.ecommercebackend.modules.payment.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "payments")
public class Payment {
    @Id
    private String id;
    private String orderId;
    private String userId;
    private PaymentMethod paymentMethod;
    private PaymentStatus status;
    private double amount;
    private String transactionId;
    private String paymentGateway;
    private LocalDateTime paymentDate;
}
