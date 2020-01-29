package com.webservice.demoOne.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SevenService {

    @GetMapping("/seven")
    public int getOne(){
        return 7;
    }

    @GetMapping("/seven/{number}")
    public int getPositionOne(@PathVariable int number){
        return number*10+7;
    }
}
