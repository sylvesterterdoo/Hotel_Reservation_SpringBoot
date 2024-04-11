package com.example.hotelreservation;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ReservationRequest {

    @JsonProperty("hotel_name")
    private String hotelName;

    @JsonProperty("checkin")
    private String checkInDate;

    @JsonProperty("checkout")
    private String checkOutDate;

    @JsonProperty("guest_list")
    private List<HotelGuest> guestList;

    public ReservationRequest() {
        // Default constructor
    }

    public ReservationRequest(String hotelName, String checkInDate, String checkOutDate, List<HotelGuest> guestList) {
        this.hotelName = hotelName;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.guestList = guestList;
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
