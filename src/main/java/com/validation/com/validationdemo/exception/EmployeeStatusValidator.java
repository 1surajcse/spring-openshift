package com.validation.com.validationdemo.exception;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.List;

public class EmployeeStatusValidator implements ConstraintValidator<StatusValidation,String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {

        List<String> allStatus=List.of("Active","Inactive");
        return allStatus.contains(s);
    }
}
