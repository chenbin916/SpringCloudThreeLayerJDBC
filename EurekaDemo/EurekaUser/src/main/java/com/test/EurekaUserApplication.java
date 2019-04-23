package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;  

@SpringBootApplication  
@EnableDiscoveryClient  
@EnableFeignClients  
public class EurekaUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaUserApplication.class, args);
		System.out.println("<<--------------------------------->>Eureka User  Start Success");  
	}
}
