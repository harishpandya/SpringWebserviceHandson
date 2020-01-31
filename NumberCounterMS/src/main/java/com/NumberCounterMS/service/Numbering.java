package com.NumberCounterMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class Numbering {


    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/ek")
    public int getNumbering(){

        System.out.println(" in the method");
        int i=restTemplate.getForObject("http://ONE/one", Integer.class);
        System.out.println(" done in the method");
return 1;
    }
    @GetMapping("/do")
    public int getNumberingDo(){

        System.out.println(" in the method");
        int i=restTemplate.getForObject("http://TWO/two", Integer.class);
        System.out.println(" done in the method");
        return i;
    }
}
