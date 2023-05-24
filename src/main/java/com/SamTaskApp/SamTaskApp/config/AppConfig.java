package com.SamTaskApp.SamTaskApp.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//define the bean
@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate () {
        return new RestTemplate();
    }



}
