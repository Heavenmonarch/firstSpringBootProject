package com.example.firstSpringBootProject.controller;

import com.example.firstSpringBootProject.pojo.BaseResponse;
import com.example.firstSpringBootProject.pojo.UserData;
import com.example.firstSpringBootProject.service.AppService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ApplicationController {

    @Autowired
    AppService appService;

    @PostMapping("/create-user")
    public ResponseEntity<BaseResponse> createUser(@Valid @RequestBody UserData userData) {
        BaseResponse baseResponse = appService.createUser(userData);
        HttpStatus status = (baseResponse.getStatus() == 200) ? HttpStatus.OK : HttpStatus.BAD_REQUEST;

        return new ResponseEntity<>(baseResponse, status);
    }









    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseResponse handleValidationExceptions(MethodArgumentNotValidException ex) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setStatus(400);
        baseResponse.setDescription("An error occurred");

        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        baseResponse.setData(errors);
        return baseResponse;
    }
}