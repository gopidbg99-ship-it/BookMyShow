package com.gopi.bookmyshow.models;

import com.gopi.bookmyshow.models.Enums.PaymentMode;
import com.gopi.bookmyshow.models.Enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{

    private Long amount;
@Enumerated(EnumType.ORDINAL)
    private PaymentMode paymentMode;

@Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;

    private Long teansactionId;

}
