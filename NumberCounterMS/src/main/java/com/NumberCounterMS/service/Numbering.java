package com.NumberCounterMS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

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
    @GetMapping("/count/{number}")
    public String getCounting(@PathVariable int number) {
        List string = new ArrayList();

        for (int i=1; i<number;i++ ) {

            string.add(restTemplate.getForObject("http://ONE/one", Integer.class))  ;
            string.add(restTemplate.getForObject("http://TWO/two", Integer.class) );
            string.add(restTemplate.getForObject("http://THREE/three", Integer.class));
            string.add(restTemplate.getForObject("http://FOUR/four", Integer.class) );
            string.add(restTemplate.getForObject("http://FIVE/five", Integer.class) );
            string.add(restTemplate.getForObject("http://SIX/six", Integer.class) );
            string.add(restTemplate.getForObject("http://SEVEN/seven", Integer.class)) ;
            string.add(restTemplate.getForObject("http://EIGHT/eight", Integer.class) );
            string.add(restTemplate.getForObject("http://NINE/nine", Integer.class) );
        }


        return "String total count -> "+ string.size()+"/n "+string.toString();
    }

}
