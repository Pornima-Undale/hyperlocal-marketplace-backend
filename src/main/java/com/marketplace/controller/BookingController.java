package com.marketplace.controller;

import com.marketplace.entity.Booking;
import com.marketplace.service.BookingService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public Booking createBooking(
            @RequestBody Booking booking) {

        return bookingService.saveBooking(booking);
    }
}