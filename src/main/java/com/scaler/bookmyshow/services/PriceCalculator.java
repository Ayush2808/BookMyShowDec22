package com.scaler.bookmyshow.services;

import com.scaler.bookmyshow.Models.ShowSeat;
import com.scaler.bookmyshow.Models.ShowSeatType;
import com.scaler.bookmyshow.Models.Shows;
import com.scaler.bookmyshow.repositories.ShowSeatTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceCalculator {

    private ShowSeatTypeRepository showSeatTypeRepository;

    @Autowired
    PriceCalculator(ShowSeatTypeRepository showSeatTypeRepository) {
        this.showSeatTypeRepository = showSeatTypeRepository;
    }

    public int calculatePrice(List<ShowSeat> showSeats, Shows shows){

        List<ShowSeatType> showSeatTypes = showSeatTypeRepository.findAllByShows(shows);
        int amount = 0;
        for (ShowSeat showSeat : showSeats) {
             for(ShowSeatType showSeatType : showSeatTypes){
                 if(showSeat.getSeat().equals(showSeatType)){
                     amount += showSeatType.getPrice();
                 }
             }
        }
        return amount;
    }
}
