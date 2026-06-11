package com.gopi.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Theatre extends  BaseModel{

    private  String name;

    private  String address;
    @ManyToOne
    @JoinColumn(name = "theatre_id")
    private List<Screen> screens;

}
