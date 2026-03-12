package com.eventhub.Eventhub.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class Config {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .csrf(csrf -> csrf.disable())   // disable csrf for Postman
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()  // allow all APIs
                );

        return http.build();
    }
}