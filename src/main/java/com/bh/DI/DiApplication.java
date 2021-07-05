package com.bh.DI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(DiApplication.class, args)) {
			Frontend frontend = context.getBean(Frontend.class);
			frontend.run();

		}
	}

}
