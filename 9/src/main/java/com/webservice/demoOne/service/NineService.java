package com.webservice.demoOne.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NineService {

    @GetMapping("/nine")
    public int getOne(){
        return 9;
    }

    @GetMapping("/nine/{number}")
    public int getPositionOne(@PathVariable int number){
        return number*10+9;
    }
}
