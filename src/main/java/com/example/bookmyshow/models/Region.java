package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity(name = "regions")
public class Region extends BaseModel {
    //City
    private String name;
}