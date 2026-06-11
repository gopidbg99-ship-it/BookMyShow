package com.gopi.bookmyshow.models;

import com.gopi.bookmyshow.models.Enums.Feature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Screen extends BaseModel{

    private  String name;
@OneToMany
@JoinColumn(name = "screen_id")
    private List<Seat>seats;

    private Long capacity;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> featured;
}
