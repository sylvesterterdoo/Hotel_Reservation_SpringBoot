package com.example.hotelreservation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HotelReservationApiController {

    private final Random random = new Random();


    @GetMapping("/reservation")
    public String getHotels() {
        return "Hello Reservation";
    }

    @PostMapping(value = "/reservation", consumes = "application/json", produces = "application/json")
    public ReservationResponse guestsReservation(@RequestBody ReservationRequest reservationRequest) {
        // Assuming the hotel name is received in the reservationRequest object
        String hotelName = reservationRequest.getHotelName();

        // Generate a random confirmation number between 1 and 100 (inclusive)
        int randomNumber = random.nextInt(100) + 1;

        // Create a new ReservationResponse object with the generated confirmation number
        return new ReservationResponse(randomNumber, hotelName);
    }
}