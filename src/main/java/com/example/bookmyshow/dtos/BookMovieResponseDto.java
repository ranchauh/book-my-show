package com.example.bookmyshow.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookMovieResponseDto {
    private Long bookingId;
    private ResponseStatus responseStatus;
}
