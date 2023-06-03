package com.example.water.station.kakasoasis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class KakasoasisApplication {

	public static void main(String[] args) {
		SpringApplication.run(KakasoasisApplication.class, args);
	}

}
