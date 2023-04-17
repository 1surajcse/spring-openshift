package com.example.SampleRedHat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SampleController
{
    @GetMapping
    public String welcome(){
        return "Welcome To the Redhat";
    }
    @GetMapping("/{user}")
    public String welcome(@PathVariable String user){
        return "Welcome "+user+"  To the Redhat";
    }
}
