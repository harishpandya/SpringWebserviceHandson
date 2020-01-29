package com.webservice.demoOne.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SixService {

    @GetMapping("/six")
    public int getOne(){
        return 6;
    }

    @GetMapping("/six/{number}")
    public int getPositionOne(@PathVariable int number){
        return number*10+6;
    }
}
