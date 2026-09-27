package com.example.firstSpringBootProject.pojo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import jakarta.validation.constraints.Pattern;

// import java.util.Date;

import static com.example.firstSpringBootProject.config.AppConstant.*;

@Data
public class UserData {
    @NotEmpty(message = "First name cannot be empty") 
    @Pattern(regexp = NAME_VALIDATION_REGEX, message = "First name must be at least three characters")
    private String firstName;

    @NotEmpty(message = "Last name cannot be empty")
    @Pattern(regexp = NAME_VALIDATION_REGEX, message = "Last name must be at least three characters")
    private String lastName;

    @NotEmpty (message = "Phone number cannot be empty")
    @Pattern(regexp = PHONENUMBER_VALIDATION_REGEX, message = PHONENUMBER_VALIDATION_ERROR_MESSAGE)
    private String phoneNumber;

    @NotEmpty (message = "Email address cannot be empty")
    @Email(message = "Invalid email address")
    private String emailAddress;

    @NotEmpty (message = "Date of birth cannot be empty")
    @Pattern(regexp = DATE_OF_BIRTH_REGEX, message = DATE_OF_BIRTH_VALIDATION_MSG)
    private String dateOfBirth;

    @NotEmpty (message = "Password cannot be empty")
    @Pattern(regexp = PASSWORD_PATTERN, message = PASSWORD_VALIDATION_MSG)
    private String password;
}