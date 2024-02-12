package com.example.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class BaseModel {
    private Long id;
    private Date createdAt;
    private Date modifiedAt;
}
