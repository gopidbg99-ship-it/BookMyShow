package com.gopi.bookmyshow.models;

import com.gopi.bookmyshow.models.Enums.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends  BaseModel{
@ManyToOne
    private Show show;

@Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

    private Long price;

}
