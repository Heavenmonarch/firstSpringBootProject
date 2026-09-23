package com.example.firstSpringBootProject.pojo;

import lombok.Data;
import java.util.Date;

@Data
public class UserData {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private Date dateOfBirth;
    private String password;
}
