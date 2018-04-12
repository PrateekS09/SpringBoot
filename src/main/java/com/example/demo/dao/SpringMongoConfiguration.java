package com.example.demo.dao;

import com.mongodb.MongoClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
public class SpringMongoConfiguration {
	
	@Value("${spring.data.mongodb.database}")
	private String db;
	
	@Value("${spring.data.mongodb.host}")
	private String hostname;

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		return new MongoTemplate(new MongoClient(hostname), db);
	}

}