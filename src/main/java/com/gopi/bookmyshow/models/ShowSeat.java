package com.gopi.bookmyshow.models;

import com.gopi.bookmyshow.models.Enums.ShowSeatStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
@ManyToOne
@JoinColumn(name = "showSeat_id")
    private Seat seat;
    @ManyToOne
    @JoinColumn(name = "showSeat_id")
    public Show show;

    //private Long price;
@Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;

}
