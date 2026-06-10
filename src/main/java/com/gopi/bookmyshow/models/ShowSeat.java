package com.gopi.bookmyshow.models;

import com.gopi.bookmyshow.models.Enums.ShowSeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
@ManyToOne
    private Seat seat;
@ManyToOne
    public Show show;

    //private Long price;
@Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;

}
