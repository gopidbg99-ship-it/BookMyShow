package com.gopi.bookmyshow.models;

import com.gopi.bookmyshow.models.Enums.Feature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity(name="shows")
public class Show extends BaseModel{

    @ManyToOne
    private Movie movie;

    private Long startTime;

    private Long endTime;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;

@ManyToOne
    private Screen screen;


}

