package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestClient {
	
	/*@Autowired
	RestTemplate restTemplate;*/
	
	
	public static void main(String args[]) {
		RestClient restC = new RestClient();
		restC.printLog(" This is Logging statement ");
		
	}
	
	/*@Bean
	public RestTemplate getRestTemplate() {
		RestTemplateBuilder builder = new RestTemplateBuilder();
		return builder.build();
	}*/
	
	
	public void printLog(String logString) {
		LoggingController.Logger logger = new LoggingController.Logger();
		RestTemplate restTemplate = new RestTemplate();
		logger.setLogString(logString);
		restTemplate.put("http://localhost:8080/logging", logger);
	}

}
