package com.gopi.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


@MappedSuperclass
@Getter
@Setter
public class BaseModel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
@CreatedDate
    private Long createdAt;
@LastModifiedDate
    private Long updatedAt;


}
