package com.example.hotelreservation;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HotelDataLoader {
    private final HotelRepository hotelRepository;

    public HotelDataLoader(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @PostConstruct
    private void loadHotelData() {
        this.hotelRepository.saveAll( List.of(
                        new Hotel("Halifax Hotel") ,
                        new Hotel("Dartmouth Hotel")
                )
        );
    }
}
