package com.pack;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan()
public class AppConfig {
	//No explicit bean definitions are required,spring will auto-detect beans

}
