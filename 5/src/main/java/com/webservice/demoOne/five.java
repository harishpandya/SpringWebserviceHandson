package com.webservice.demoOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class five {

	public static void main(String[] args) {
		SpringApplication.run(five.class, args);
	}

}
