package com.daya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
public class EcommerceMultivendorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceMultivendorApplication.class, args);
	}

}
