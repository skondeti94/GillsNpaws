package com.fullstack.GillsNpaws;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.Customizer;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Disable CSRF for testing
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/GillsNpaws/**").permitAll() // Allow all requests under this path
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults()); // Correct way to enable Basic Auth in Spring Security 6.1+

        return http.build();
    }
}



