package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Booking extends BaseModel { //Ticket
    private BookingStatus bookingStatus;
    private List<ShowSeat> showSeats;
    private int amount;
    private List<Payment> payments;
    private User user;
}
