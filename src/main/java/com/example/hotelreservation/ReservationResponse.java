package com.example.hotelreservation;
class ReservationResponse {
    private Long confirmationNumber;
//    private String hotelName;

    public ReservationResponse(Long confirmationNumber, String hotelName) {
        this.confirmationNumber = confirmationNumber;
//        this.hotelName = hotelName;
    }

    public Long getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(Long confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

//    public String getHotelName() {
//        return hotelName;
//    }
//
//    public void setHotelName(String hotelName) {
//        this.hotelName = hotelName;
//    }
}