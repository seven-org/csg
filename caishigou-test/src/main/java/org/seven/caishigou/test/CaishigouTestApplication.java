package org.seven.caishigou.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"org.seven.caishigou.test.domain", "org.seven.caishigou.test.config"})
@SpringBootApplication
public class CaishigouTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaishigouTestApplication.class, args);
	}
}
