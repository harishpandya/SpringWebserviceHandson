package com.webservice.demoOne.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoService {

    @GetMapping("/two")
    public int getOne(){
        return 2;
    }

    @GetMapping("/two/{number}")
    public int getPositionOne(@PathVariable int number){
        return number*10+2;
    }
}
