package com.gopi.bookmyshow.dtos;

import com.gopi.bookmyshow.models.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsereSignupResponseDTO {

    User user;

    String message;

    ResponseStaus responseStaus;
}
