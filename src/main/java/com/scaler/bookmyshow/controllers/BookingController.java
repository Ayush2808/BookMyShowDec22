package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.dto.BookMovieRequestDTO;
import com.scaler.bookmyshow.dto.BookMovieResponseDTO;
import com.scaler.bookmyshow.Models.Booking;

import com.scaler.bookmyshow.dto.ResponseStatus;
import com.scaler.bookmyshow.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class BookingController {
    private BookingService bookingService;

    @Autowired
    BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    public BookMovieResponseDTO bookMovie(BookMovieRequestDTO bookMovieRequestDTO) {
        BookMovieResponseDTO response = new BookMovieResponseDTO();
        try{
            Booking booking = bookingService.bookMovie(
                    bookMovieRequestDTO.getUserId(),
                    bookMovieRequestDTO.getShowSeatIds(),
                    bookMovieRequestDTO.getShowId()
            );
            response.setBookingId(booking.getId());
            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setAmount(booking.getAmount());
        }catch(Exception e){
               response.setResponseStatus(ResponseStatus.FAILURE);
        }
        return response;
    }
}
