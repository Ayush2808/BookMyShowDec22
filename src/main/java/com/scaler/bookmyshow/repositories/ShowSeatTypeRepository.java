package com.scaler.bookmyshow.repositories;

import com.scaler.bookmyshow.Models.ShowSeatType;
import com.scaler.bookmyshow.Models.Shows;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Long> {
       List<ShowSeatType> findAllByShows(Shows shows);
}
