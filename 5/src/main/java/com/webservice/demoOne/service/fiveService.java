package com.webservice.demoOne.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class fiveService {

    @GetMapping("/five")
    public int getOne(){
        return 5;
    }

    @GetMapping("/five/{number}")
    public int getPositionOne(@PathVariable int number){
        return number*10+5;
    }
}
