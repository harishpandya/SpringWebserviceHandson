package com.webservice.demoOne.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EightService {

    @GetMapping("/eight")
    public int getOne(){
        return 8;
    }

    @GetMapping("/eight/{number}")
    public int getPositionOne(@PathVariable int number){
        return number*10+8;
    }
}
