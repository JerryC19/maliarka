package com.maliarka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MaliarkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaliarkaApplication.class, args);
	}

}
