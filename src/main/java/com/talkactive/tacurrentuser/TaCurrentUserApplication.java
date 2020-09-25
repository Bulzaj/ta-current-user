package com.talkactive.tacurrentuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TaCurrentUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaCurrentUserApplication.class, args);
    }

}
