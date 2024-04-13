package com.example.hotelreservation;

//import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hotel_name")
    private String hotelName;

    @Column(name = "checkin")
    private String checkInDate;

    @Column(name = "checkout")
    private String checkOutDate;

    @OneToMany(mappedBy = "reservation", cascade = CascadeType.ALL)
    private List<HotelGuest> guestList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public List<HotelGuest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<HotelGuest> guestList) {
        this.guestList = guestList;
    }
}

