package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.demo")
public class SimpleMongoConfig {
	
	/* @Bean
	    public Mongo mongo() throws Exception {
	        return new MongoClient("localhost");
	    }*/
	
	/* @Bean
	    public MongoDbFactory mongoDbFactory() throws Exception {
	 
	        MongoClient mongoClient = new MongoClient("localhost", 27017);
	        UserCredentials userCredentials = new UserCredentials("", "");
	        return new SimpleMongoDbFactory(mongoClient, "technicalkeeda", userCredentials);
	 
	    }*/
	 
	 
	 /*@Bean
	    public MongoTemplate mongoTemplate() throws Exception {
	        return new MongoTemplate(mongo(), "MyMongodb");
	    }*/

}
