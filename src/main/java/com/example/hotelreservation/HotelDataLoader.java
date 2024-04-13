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
                new Hotel(1, "Halifax Hotel", 152.3, true),
                new Hotel(2, "Dartmouth Hotel", 240.5, false),
                new Hotel(3, "Bedford Hotel", 260.7, true),
                new Hotel(4, "Calgary Hotel", 170.7, true),
                new Hotel(5, "Toronto Hotel", 370.7, true),
                new Hotel(6, "Vancouver Hotel", 270.7, true),
                new Hotel(7, "Montreal Hotel", 270.7, true)
                )
        );
    }
}
