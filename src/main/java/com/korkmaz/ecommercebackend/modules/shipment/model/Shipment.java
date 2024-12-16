package com.korkmaz.ecommercebackend.modules.shipment.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "shipments")
public class Shipment {
    @Id
    private String id;
    private String trackingNumber;
    private String carrierName;
    private LocalDateTime shippedDate;
    private LocalDateTime estimatedDeliveryDate;
    private ShipmentStatus status;
}
