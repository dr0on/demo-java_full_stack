package com.thoughtscript.javafullstack.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.thoughtscript.javabackend")
public class Config {
	
	 @Bean  
	  public UrlBasedViewResolver setupViewResolver() {  
	      UrlBasedViewResolver resolver = new UrlBasedViewResolver();  
	      resolver.setPrefix("/webapp/");  
	      resolver.setSuffix(".jsp");  
	      resolver.setViewClass(JstlView.class);  
	      return resolver;  
	  }  
	  
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
	      registry.addResourceHandler("/resources/**").addResourceLocations("/webapp/resources/*");
	  }
}