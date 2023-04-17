package com.validation.com.validationdemo.exception;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;


@Target({ElementType.FIELD,ElementType.PARAMETER})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EmployeeStatusValidator.class)
public @interface StatusValidation {

    public String message() default "Invalid Status: Status should be either Active or Inactive";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
