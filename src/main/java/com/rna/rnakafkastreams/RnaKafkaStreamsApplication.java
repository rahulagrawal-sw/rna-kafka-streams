package com.rna.rnakafkastreams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RnaKafkaStreamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RnaKafkaStreamsApplication.class, args);
	}

}
