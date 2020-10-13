package com.uguraytekin.customerservice.api.models.request;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReserveCreditRequest {
    private int orderId;
    private int customerId;
    private double amount;
}
