package com.scaler.bookmyshow.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class ShowSeatType extends BaseModel{
    private Shows shows;
    private SeatType seatType;
    private int price;
}
