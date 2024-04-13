package com.example.hotelreservation;
class ReservationResponse {
    private Long confirmationNumber;

    public ReservationResponse(Long confirmationNumber, String hotelName) {
        this.confirmationNumber = confirmationNumber;
    }

    public Long getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(Long confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }
}