package com.scaler.bookmyshow.controllers;

import com.scaler.bookmyshow.dto.ResponseStatus;
import com.scaler.bookmyshow.dto.SignUpRequestDTO;
import com.scaler.bookmyshow.dto.SignUpResponseDTO;
import com.scaler.bookmyshow.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.scaler.bookmyshow.Models.User;

@Controller
public class UserController {
      private UserService userService;
      @Autowired
      UserController(UserService userService){
          this.userService = userService;
      }
      public SignUpResponseDTO signUp(SignUpRequestDTO signUpRequestDTO){
          SignUpResponseDTO response = new SignUpResponseDTO();
          try{
              User user = userService.signUp(
                      signUpRequestDTO.getEmail(),
                      signUpRequestDTO.getPassword()
              );
              response.setResponseStatus(ResponseStatus.SUCCESS);
              response.setUserId(user.getId());
          }catch(Exception e){
              response.setResponseStatus(ResponseStatus.FAILURE);
          }
          return response;
      }



}

