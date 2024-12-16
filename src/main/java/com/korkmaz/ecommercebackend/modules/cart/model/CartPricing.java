package com.korkmaz.ecommercebackend.modules.cart.model;

import lombok.Data;

@Data
public class CartPricing {
    private double subtotal;
    private double taxAmount;
    private double discountAmount;
    private double shippingEstimate;
    private double totalAmount;
}