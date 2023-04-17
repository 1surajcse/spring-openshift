package com.validation.com.validationdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionContoller {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String,String> handle(MethodArgumentNotValidException ex){
        Map<String,String>mp=new HashMap<String,String>();
        ex.getBindingResult().getFieldErrors().forEach(e ->{

                mp.put(e.getField(), e.getDefaultMessage());
                });

        return mp;
    }
}
