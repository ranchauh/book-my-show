package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel { //Ticket
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
    @OneToMany
    private List<ShowSeat> showSeats;
    private int amount;
    @OneToMany
    private List<Payment> payments;
    @ManyToOne
    private BmsUser bmsUser;
}
