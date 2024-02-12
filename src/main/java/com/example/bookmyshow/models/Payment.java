package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Payment extends BaseModel {
    private int amount;
    private String referenceNo;
    private PaymentProvider paymentProvider;
    private PaymentStatus paymentStatus;
}
