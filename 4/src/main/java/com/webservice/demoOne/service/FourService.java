package com.webservice.demoOne.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FourService {

    @GetMapping("/four")
    public int getOne(){
        return 4;
    }

    @GetMapping("/four/{number}")
    public int getPositionOne(@PathVariable int number){
        return number*10+4;
    }
}
