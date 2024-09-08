package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.dto.BookMovieRequestDTO;
import com.scaler.bookmyshow.dto.BookMovieResponseDTO;
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
        return null;
    }
}
