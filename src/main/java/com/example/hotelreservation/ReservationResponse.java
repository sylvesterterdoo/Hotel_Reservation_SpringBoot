package com.example.hotelreservation;
class ReservationResponse {
    private Integer confirmationNumber;
    private String hotelName;

    public ReservationResponse(Integer confirmationNumber, String hotelName) {
        this.confirmationNumber = confirmationNumber;
        this.hotelName = hotelName;
    }

    public Integer getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(Integer confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}