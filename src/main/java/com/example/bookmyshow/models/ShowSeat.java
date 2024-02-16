package com.example.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import lombok.Getter;
import lombok.Setter;
import org.springframework.core.annotation.MergedAnnotations;

@Getter
@Setter
@Entity(name = "show_seat")
public class ShowSeat extends BaseModel {
    @ManyToOne
    private Show show;

    @ManyToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;
}

/*
   1            1
showSeat ----- Show
   M            1

    1           1
showSeat ----- seat
    M            1
 */
