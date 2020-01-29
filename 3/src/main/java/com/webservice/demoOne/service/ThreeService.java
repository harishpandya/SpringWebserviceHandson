package com.webservice.demoOne.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreeService {

    @GetMapping("/three")
    public int getOne(){
        return 3;
    }

    @GetMapping("/three/{number}")
    public int getPositionOne(@PathVariable int number){
        return number*10+3;
    }
}
