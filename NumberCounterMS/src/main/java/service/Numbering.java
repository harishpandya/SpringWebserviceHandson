package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Numbering {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/Numbering/{tillNumber}")
    public String getNumbering(@PathVariable int tillNumber){
        restTemplate.g
    }
}
