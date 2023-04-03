package com.ApiAssignment.restfulapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "/hi")
public class Welcome {
    @GetMapping("")
    public String print(){
        return "Welcome to Spring boot";
    }
}
