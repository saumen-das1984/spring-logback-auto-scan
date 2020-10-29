package com.signify.test.logging.level.logback.auto.scan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringLogbackAutoScanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLogbackAutoScanApplication.class, args);
	}

}
