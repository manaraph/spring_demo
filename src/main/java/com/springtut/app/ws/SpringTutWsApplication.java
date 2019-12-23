package com.springtut.app.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.springtut.app.ws.security.AppProperties;

@SpringBootApplication
public class SpringTutWsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTutWsApplication.class, args);
	}
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SpringApplicationContext springApplicationContext() {
		return new SpringApplicationContext();
	}
	
	@Bean("AppProperties")
	public AppProperties getAppProperties() {
		return new AppProperties();
	}

}
