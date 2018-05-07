package com.leon.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);

		//控制banner是否开启
//		SpringApplication application = new SpringApplication(EurekaServerApplication.class);
//		application.setBannerMode(Banner.Mode.OFF);
//		application.run(args);
	}
}
