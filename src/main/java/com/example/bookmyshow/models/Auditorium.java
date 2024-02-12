package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Auditorium extends BaseModel {
    private String name;
    private Theatre theatre;
    private List<Seat> seats;
    private List<Feature> features;
    private List<Show> shows;
}
