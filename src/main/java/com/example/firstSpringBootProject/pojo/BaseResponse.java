package com.example.firstSpringBootProject.pojo;


import lombok.Data;

@Data
public class BaseResponse{
    
    private int status;
    private String description;
    private Object data;

    public BaseResponse() {
        
    }

    public BaseResponse(boolean error) {
        this.status = 500;
        this.description = "An error has occurred";
    }


}
