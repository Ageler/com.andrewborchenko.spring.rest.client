package com.andrewborchenko.spring.rest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.andrewborchenko.spring.rest")
public class MyConfig {

    /*вспомогательный встроенный класс для Rest приложения служит для связи с другим rest приложением*/
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
