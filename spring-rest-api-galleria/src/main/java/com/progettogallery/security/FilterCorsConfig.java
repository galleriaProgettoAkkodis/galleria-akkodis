package com.progettogallery.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class FilterCorsConfig implements WebMvcConfigurer{
@Bean
public WebMvcConfigurer corsConfigurer() {
return new WebMvcConfigurer() {
@Override
public void addCorsMappings(CorsRegistry registry) {
registry.addMapping("/**") //abilito tutti gli url
.allowedOrigins("*") //abilito qualunque server di origine
.allowedMethods("PUT","POST","DELETE","GET","OPTION","HEAD","PATCH")

//abilito tutti i metodi

.allowedHeaders("*") //abilito tutti gli headers
.exposedHeaders("header1","header2","Authorization") 
.allowCredentials(false); //disabilito le credenziali
}};}}