package com.progetto.managerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*@autori
Marco Scaramuzzi
Damiano Colucci
Alessandro Calò
Luca Strippoli
Gruppo T19
 */
@EnableEurekaClient
@SpringBootApplication
public class ManagerServiceApplication {
	@Bean
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(ManagerServiceApplication.class, args);
	}

}
