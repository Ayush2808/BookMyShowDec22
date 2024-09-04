package com.scaler.bookmyshow.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    private Shows shows;
    private Seat seat;
    private ShowSeatStatus showSeatStatus;
}
