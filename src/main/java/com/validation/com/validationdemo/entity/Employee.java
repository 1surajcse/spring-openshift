package com.validation.com.validationdemo.entity;

import com.validation.com.validationdemo.exception.StatusValidation;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    private Long empId;
    @NotNull(message = "FirstName Should not be null")
    @NotEmpty(message = "FirstName Should not be Empty")
    private String firstName;
    private String lastName;
    @NotBlank
    private String mobileNo;
    @Email
    private String email;
    @StatusValidation
    private  String status;
}
