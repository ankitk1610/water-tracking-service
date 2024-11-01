package com.idp.watertracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableMongoRepositories(basePackages = "com.idp.watertracker")
@EnableAutoConfiguration
public class WaterTrackerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WaterTrackerServiceApplication.class, args);
	}

}
