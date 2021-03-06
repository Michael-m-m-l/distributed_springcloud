package com.distributed_springcloud.register_center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegisterCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterCenterApplication.class, args);
	}

}
