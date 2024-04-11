package com.example.hotelreservation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HotelGuest {
    @JsonProperty("guest_name")
    String guestName;
    @JsonProperty("gender")
    String gender;


    public HotelGuest() {
    }

    public HotelGuest(String guestName, String gender) {
        this.guestName = guestName;
        this.gender = gender;
    }
}
