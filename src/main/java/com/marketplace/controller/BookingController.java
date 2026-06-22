package com.marketplace.controller;

import com.marketplace.dto.BookingResponseDto;
import com.marketplace.entity.Booking;
import com.marketplace.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public List<BookingResponseDto> getAllBookings() {

        return bookingService.getAllBookings();
    }

    @PutMapping("/{id}/accept")
    public Booking acceptBooking(
            @PathVariable Long id) {

        return bookingService.acceptBooking(id);
    }

    @PutMapping("/{id}/complete")
    public Booking completeBooking(
            @PathVariable Long id) {

        return bookingService.completeBooking(id);
    }
}