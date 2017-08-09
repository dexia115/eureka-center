package com.eureka.discovery;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaCenterApplication {
	
	public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaCenterApplication.class).web(true).run(args);
    }

}
