package com.example.firstSpringBootProject.controller;


import com.example.firstSpringBootProject.pojo.BaseResponse;
import com.example.firstSpringBootProject.pojo.UserData;
import com.example.firstSpringBootProject.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @Autowired
    AppService appService;

    @PostMapping("/create-user")
    public ResponseEntity createUser(@RequestBody UserData userData){
        BaseResponse baseResponse = appService.createUser(userData);
        HttpStatus status = (baseResponse.getStatus()  == 200) ? HttpStatus.OK : HttpStatus.BAD_REQUEST;


        return new ResponseEntity<>(baseResponse, status );
    }
}