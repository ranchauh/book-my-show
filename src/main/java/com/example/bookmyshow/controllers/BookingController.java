package com.example.bookmyshow.controllers;

import com.example.bookmyshow.dtos.BookMovieRequestDto;
import com.example.bookmyshow.dtos.BookMovieResponseDto;
import com.example.bookmyshow.dtos.ResponseStatus;
import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.services.BookingService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    final private BookingService bookingService;

    BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    public BookMovieResponseDto bookTicket(BookMovieRequestDto requestDto) {
        BookMovieResponseDto responseDto = new BookMovieResponseDto();
        try {
            Booking booking = bookingService.bookTicket(requestDto.getUserId(),
                    requestDto.getShowId(),
                    requestDto.getShowSeatIds());
            responseDto.setBookingId(booking.getId());
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }
        return responseDto;
    }
}
