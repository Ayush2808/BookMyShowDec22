package com.scaler.bookmyshow.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity


public class Payment extends BaseModel{
    private String refNo;
    private String amount;
    private Booking booking;
    private PaymentStatus paymentStatus;
    private PaymentProvider paymentProvider;
}
