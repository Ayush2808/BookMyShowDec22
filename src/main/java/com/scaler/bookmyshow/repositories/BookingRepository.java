package com.scaler.bookmyshow.repositories;
import com.scaler.bookmyshow.Models.Booking;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
