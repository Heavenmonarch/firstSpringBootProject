package com.example.firstSpringBootProject.pojo;


import lombok.Data;

@Data
public class BaseResponse{

    private int status;
    private String description;
    private Object data;
}
