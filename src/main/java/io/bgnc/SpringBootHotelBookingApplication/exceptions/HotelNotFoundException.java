package io.bgnc.SpringBootHotelBookingApplication.exceptions;

public class HotelNotFoundException extends RuntimeException {
    public HotelNotFoundException(String s) {
        super(s);
    }
}
