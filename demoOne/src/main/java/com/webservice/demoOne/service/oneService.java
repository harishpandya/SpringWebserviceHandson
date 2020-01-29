package com.webservice.demoOne.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class oneService {

    @GetMapping("/one")
    public int getOne(){
        return 1;
    }

    @GetMapping("/one/{number}")
    public int getPositionOne(@PathVariable int number){
        return number*10+1;
    }
}
