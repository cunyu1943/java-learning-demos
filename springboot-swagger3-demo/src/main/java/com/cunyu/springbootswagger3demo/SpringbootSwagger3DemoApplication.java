package com.cunyu.springbootswagger3demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@SpringBootApplication
public class SpringbootSwagger3DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootSwagger3DemoApplication.class, args);
    }

}
