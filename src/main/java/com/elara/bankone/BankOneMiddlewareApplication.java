package com.elara.bankone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BankOneMiddlewareApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankOneMiddlewareApplication.class, args);
	}

}
