package com.example.hotelreservation;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/")
    String hello() {
        return "Hotels";
    }

    @GetMapping("/hotels")
    Iterable<Hotel> getHotels() {
        return hotelRepository.findAll();
    }

    @PostMapping(value = "/hotels", consumes = "application/json")
    ResponseEntity<Hotel> postHotel(@RequestBody Hotel hotel) {
       return new ResponseEntity<>(hotelRepository.save(hotel), HttpStatus.CREATED);
    }
}
