package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@ComponentScan("com.example")
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	@Bean
	public UserDetailsService userDetailsService() {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withDefaultPasswordEncoder()
				.username("vignesh").password("admin").roles("ADMIN").build());
		return manager;
	}
	
	@Override
	protected void configure(HttpSecurity http)throws Exception{
		http
		.authorizeRequests()
			.anyRequest().hasRole("ADMIN")
			.and().formLogin().and()
		.httpBasic()
		.and()
		.logout()
		.logoutUrl("/j_spring_security_logout")
		.logoutSuccessUrl("/")
		;
	}
	
}
