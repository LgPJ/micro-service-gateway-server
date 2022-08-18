package com.microservice.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroServiceGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServiceGatewayServerApplication.class, args);
	}

}
