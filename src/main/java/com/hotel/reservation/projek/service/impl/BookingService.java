package com.hotel.reservation.projek.service.impl;

import com.hotel.reservation.projek.model.dto.Response;
import com.hotel.reservation.projek.model.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}
