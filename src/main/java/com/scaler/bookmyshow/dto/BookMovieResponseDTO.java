package com.scaler.bookmyshow.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookMovieResponseDTO {
       private ResponseStatus responseStatus;

       private Long bookingId;
       private int amount;
}
