package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.Models.Booking;

import com.scaler.bookmyshow.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import com.scaler.bookmyshow.Models.User;
import java.util.Optional;


import java.util.List;

@Service
public class BookingService {

    private UserRepository userRepository;

    @Autowired
    BookingService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public Booking bookMovie(
        Long userId,
        List<Long> seatId,
        Long showId
     ){

        Optional<User> userOptional = userRepository.findById(userId);
         return null;
    }
}
