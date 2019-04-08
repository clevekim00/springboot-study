package me.clevekim.study.springboot.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("me.clevekim.study.springboot.bootstrap.repo")
@EntityScan("me.clevekim.study.springboot.bootstrap.model")
@SpringBootApplication
public class BootstrapApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootstrapApplication.class, args);
	}
}
