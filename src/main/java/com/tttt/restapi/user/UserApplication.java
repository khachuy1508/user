package com.tttt.restapi.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan(basePackages="com.tttt.restapi.user.*")
@SpringBootApplication
@EnableSwagger2
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
        @Bean
        public WebMvcConfigurer corsConfigurer() {
           return new WebMvcConfigurerAdapter() {
              @Override
              public void addCorsMappings(CorsRegistry registry) {
                 registry.addMapping("/**").allowedOrigins("http://localhost:8081");
              }
           };
        }

}
