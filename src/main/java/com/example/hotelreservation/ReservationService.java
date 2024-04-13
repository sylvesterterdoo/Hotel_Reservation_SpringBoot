package com.example.hotelreservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Long makeReservation(ReservationRequest reservationRequest) {
        Reservation reservation = new Reservation();
        reservation.setHotelName(reservationRequest.getHotelName());
        reservation.setCheckInDate(reservationRequest.getCheckInDate());
        reservation.setCheckOutDate(reservationRequest.getCheckOutDate());

        // Map guest list to HotelGuest entities
        List<HotelGuest> guestList = reservationRequest.getGuestList();
        guestList.forEach(guest -> guest.setReservation(reservation)); // Set reservation reference for each guest
        reservation.setGuestList(guestList);

        Reservation savedReservation = reservationRepository.save(reservation);
        return savedReservation.getId();
    }
}



/*
@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Long makeReservation(ReservationRequest reservationRequest) {
        Reservation reservation = new Reservation();
        reservation.setHotelName(reservationRequest.getHotelName());
        reservation.setCheckInDate(reservationRequest.getCheckInDate());
        reservation.setCheckOutDate(reservationRequest.getCheckOutDate());

        // Map guest list to HotelGuest entities
        List<HotelGuest> guestList = reservationRequest.getGuestList();
        guestList.forEach(guest -> guest.setReservation(reservation));
        reservation.setGuestList(guestList);

        Reservation savedReservation = reservationRepository.save(reservation);
        return savedReservation.getId();
    }
}

*/