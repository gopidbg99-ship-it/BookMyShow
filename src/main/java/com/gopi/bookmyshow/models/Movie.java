package com.gopi.bookmyshow.models;

import com.gopi.bookmyshow.models.Enums.Feature;
import com.gopi.bookmyshow.models.Enums.Language;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Movie extends BaseModel{

    private String name;

    private String description;

    private Long durationInMinutes;

@Enumerated(EnumType.ORDINAL)
@ElementCollection
    private List<Language>languages;

@Enumerated(EnumType.ORDINAL)
@ElementCollection
    private List<Feature> features;

}
