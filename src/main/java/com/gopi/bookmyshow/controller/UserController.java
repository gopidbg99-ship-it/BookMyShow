package com.gopi.bookmyshow.controller;

import com.gopi.bookmyshow.dtos.UserSignupReqestDTO;
import com.gopi.bookmyshow.dtos.UsereSignupResponseDTO;
import com.gopi.bookmyshow.models.User;
import com.gopi.bookmyshow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    UserService userService;



   public UsereSignupResponseDTO signup(UserSignupReqestDTO userSignupReqestDTO){
    UsereSignupResponseDTO responseDTO = new UsereSignupResponseDTO();
    try {
        User user = userService.signup(userSignupReqestDTO.getName(), userSignupReqestDTO.getEmail(), userSignupReqestDTO.getPasword());
    }catch (Exception e){

    }
    return  responseDTO;
    }
}
