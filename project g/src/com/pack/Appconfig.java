package com.pack;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
	@Bean
	public Service1 Display() {
		return new Service1();
	}
	@Bean
	public Process printing() {
		return new Process();
	}
}
