package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Theatre extends BaseModel {
    private String name;
    private Region region;
    private List<Auditorium> screens;
}
