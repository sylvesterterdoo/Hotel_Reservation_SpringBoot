package com.example.hotelreservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/reservation")
public class HotelReservationApiController {

    private final ReservationService reservationService;

    @Autowired
    public HotelReservationApiController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public ResponseEntity<List<Reservation>> getAllReservations() {
        List<Reservation> reservations = reservationService.getAllReservations();
        return new ResponseEntity<>(reservations, HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ReservationResponse guestsReservation(@RequestBody ReservationRequest reservationRequest) {
        Long confirmationNumber = reservationService.makeReservation(reservationRequest);
        return new ReservationResponse(confirmationNumber, reservationRequest.getHotelName());
    }
}