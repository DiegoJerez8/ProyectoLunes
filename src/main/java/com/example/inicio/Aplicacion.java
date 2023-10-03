package com.example.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EntityScan(basePackages = "com.example.model")
@EnableJpaRepositories(basePackages = "com.example.dao")
@SpringBootApplication(scanBasePackages = { "com.example.controlador", "com.example.servicio" })
public class Aplicacion {
	public static void main(String[] args) {
		SpringApplication.run(Aplicacion.class, args);
	}

}
