package com.example.hotelreservation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HotelApiController {

    private final HotelRepository hotelRepository;

    public HotelApiController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/hotels")
    Iterable<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    @PostMapping("/hotels")
    Hotel postHotel(@RequestBody Hotel hotel) {
        if (hotel.getId() == null) {
            return hotelRepository.save(new Hotel(hotel.getName()));
        }
        return hotelRepository.save(hotel);
    }
}
