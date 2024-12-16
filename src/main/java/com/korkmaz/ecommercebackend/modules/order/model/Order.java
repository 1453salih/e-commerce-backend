package com.korkmaz.ecommercebackend.modules.order.model;

import com.korkmaz.ecommercebackend.modules.payment.model.Payment;
import com.korkmaz.ecommercebackend.modules.shipment.model.Shipment;
import com.korkmaz.ecommercebackend.modules.user.model.Address;
import com.korkmaz.ecommercebackend.modules.user.model.Discount;
import com.korkmaz.ecommercebackend.modules.user.model.User;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Document(collection = "orders")
public class Order {
    @Id
    private String id;
    private String orderNumber;

    @DBRef
    private User user;

    @DBRef
    private List<OrderItem> items;

    @DBRef
    private Address shippingAddress;

    @DBRef
    private Address billingAddress;

    @DBRef
    private Payment payment;

    private OrderStatus status;

    private LocalDateTime orderDate;
    private LocalDateTime updatedAt;
    private LocalDateTime expectedDeliveryDate;

    @DBRef
    private Shipment shipment;

    @DBRef
    private Discount appliedDiscount;


    public Order() {
        this.orderNumber = generateOrderNumber();
        this.orderDate = LocalDateTime.now();
        this.status = OrderStatus.PENDING;
    }

    // Benzersiz sipariş numarası oluşturma işlemi
    private String generateOrderNumber() {
        return "ORD-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }
}