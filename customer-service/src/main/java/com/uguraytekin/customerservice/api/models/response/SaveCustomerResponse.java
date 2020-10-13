package com.uguraytekin.customerservice.api.models.response;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaveCustomerResponse {
    private int id;
    private String name;
    private double creditLimit;
    private double creditReservation;
}
