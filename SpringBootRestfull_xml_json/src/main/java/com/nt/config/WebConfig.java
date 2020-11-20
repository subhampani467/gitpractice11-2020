package com.nt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {
	
	public void configureContentNegotiaion(ContentNegotiationConfigurer configurer) {
		//set path extension to false
		configurer.favorPathExtension(false).
		favorParameter(true).
		parameterName("mediaType").
		ignoreAcceptHeader(true).
		useJaf(false).
		defaultContentType(MediaType.APPLICATION_JSON).
		mediaType("xml", MediaType.APPLICATION_XML).
		mediaType("json", MediaType.APPLICATION_JSON);		
		
	}
}