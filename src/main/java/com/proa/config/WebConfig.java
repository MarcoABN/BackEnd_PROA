package com.proa.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            // AQUI ESTÁ A MUDANÇA: Especifique as origens permitidas
            .allowedOrigins("https://campeaonautica.com.br", "https://www.campeaonautica.com.br", "http://localhost:4200", "https://52.21.85.137") 
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT")
            .allowedHeaders("*");
    }
}