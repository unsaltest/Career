package net.javafun.career.config;

import net.javafun.career.entity.User;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Config {
		
	@Bean
	public User User(){
		return new User();
	}
}
