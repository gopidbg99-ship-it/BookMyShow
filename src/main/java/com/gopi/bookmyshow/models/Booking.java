package com.gopi.bookmyshow.models;

import com.gopi.bookmyshow.models.Enums.BookingStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity

public class Booking extends BaseModel{
    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
@OneToMany
    private List<ShowSeat> showSeats;
@OneToMany
    private List<Payment> payments;
@ManyToOne
    private User user;

    private Long amount;
}
