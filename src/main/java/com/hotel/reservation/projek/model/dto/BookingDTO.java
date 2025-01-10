package com.hotel.reservation.projek.model.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.hotel.reservation.projek.model.entity.Room;
import com.hotel.reservation.projek.model.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDate;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingDTO {

    private Long id;

    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private int numOfAdults;
    private int numOfChildren;
    private int totalNumOfGuest;
    private String bookingConfirmationCode;

    private UserDTO user;
    private RoomDTO room;
}
