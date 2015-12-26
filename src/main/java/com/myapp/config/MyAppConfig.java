package com.myapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.myapp.entities.User;

@Configuration
public class MyAppConfig extends WebMvcConfigurerAdapter  {
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
	    registry.addViewController("/").setViewName("forward:/index.html");
	}
	
	@Bean
	public User user(){
		User user = new User();
		user.setName("omkar");
		return new User();
	}

}
