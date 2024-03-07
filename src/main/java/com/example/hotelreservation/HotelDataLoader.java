package com.example.hotelreservation;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public class HotelDataLoader {
    private final HotelRepository hotelRepository;

    public HotelDataLoader(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @PostConstruct
    private void loadHotelData() {
        this.hotelRepository.saveAll( List.of(
                new Hotel(1, "Halifax Hotel", 52.3, true),
                new Hotel(2, "Dartmouth Hotel", 40.5, false),
                new Hotel(3, "Bedford Hotel", 60.7, true)
                )
        );
    }
}
