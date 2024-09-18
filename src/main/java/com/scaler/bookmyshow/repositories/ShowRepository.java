package com.scaler.bookmyshow.repositories;

import com.scaler.bookmyshow.Models.Shows;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ShowRepository extends JpaRepository<Shows, Long> {
    @Override
    Optional<Shows> findById(Long aLong);
}
