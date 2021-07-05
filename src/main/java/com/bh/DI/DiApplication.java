package com.bh.DI;

import com.bh.DI.Argument.Frontend;
import com.bh.DI.Customer.domain.Customer;
import com.bh.DI.Customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class DiApplication implements CommandLineRunner {

	@Autowired
	CustomerService customerService;

	@Override
	public void run(String... strings) throws Exception{
		customerService.save(new Customer(1L, "Jane", "Kim"));
		customerService.save(new Customer(2L, "Summer", "Nguyen"));
		customerService.save(new Customer(3L, "David", "Bron"));

		customerService.findAll().forEach(System.out::println);
	}

	public static void main(String[] args) {
/*		try(ConfigurableApplicationContext context = SpringApplication.run(DiApplication.class, args)) {
			Frontend frontend = context.getBean(Frontend.class);
			frontend.run();

		}*/
		SpringApplication.run(DiApplication.class, args);
	}

}
