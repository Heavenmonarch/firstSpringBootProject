package com.example.firstSpringBootProject.pojo;

import jakarta.validation.constraints.Email;
import lombok.Data;
import jakarta.validation.constraints.Pattern;

import java.util.Date;

import static com.example.firstSpringBootProject.config.AppConstant.*;

@Data
public class UserData {

    @Pattern(regexp = NAME_VALIDATION_REGEX, message = "First name must be at least three characters")
    private String firstName;

    @Pattern(regexp = NAME_VALIDATION_REGEX, message = "Last name must be at least three characters")
    private String lastName;

    @Pattern(regexp = PHONENUMBER_VALIDATION_REGEX, message = PHONENUMBER_VALIDATION_ERROR_MESSAGE)
    private String phoneNumber;

    @Email(message = "Invalid email address")
    private String emailAddress;

    @Pattern(regexp = DATE_OF_BIRTH_REGEX, message = DATE_OF_BIRTH_VALIDATION_MSG)
    private Date dateOfBirth;

    @Pattern(regexp = PASSWORD_PATTERN, message = PASSWORD_VALIDATION_MSG)
    private String password;
}