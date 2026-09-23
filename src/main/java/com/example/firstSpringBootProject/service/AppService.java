package com.example.firstSpringBootProject.service;

import com.example.firstSpringBootProject.pojo.BaseResponse;
import com.example.firstSpringBootProject.pojo.UserData;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;


@Service
public class AppService  {
    public static final Logger LOG = Logger.getLogger(AppService.class.getName());

    public BaseResponse createUser(UserData userData){
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setStatus(500);
        baseResponse.setDescription("An error has occurred");
        try{

            if (userData.getFirstName() != null){
                baseResponse.setStatus(200);
                baseResponse.setDescription("Successful");
            }

        }catch (Exception ex){
            LOG.warning(ex.getMessage());
        }
        return baseResponse;
    }
}
