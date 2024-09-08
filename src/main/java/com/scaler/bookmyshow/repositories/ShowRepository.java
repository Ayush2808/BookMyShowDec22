package com.scaler.bookmyshow.repositories;

import com.scaler.bookmyshow.Models.Shows;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository extends JpaRepository<Shows, Long> {
}
