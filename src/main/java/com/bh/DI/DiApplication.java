package com.bh.DI;

import com.bh.DI.Argument.Argument;
import com.bh.DI.Argument.ArgumentResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.Scanner;

@SpringBootApplication
@Import(AppConfig.class)
public class DiApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext context = SpringApplication.run(DiApplication.class, args)) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter 2 numbers like 'a b' : ");

			ArgumentResolver argumentResolver = context.getBean(ArgumentResolver.class);
			Argument argument = argumentResolver.resolve(System.in);
			Calculator calculator = context.getBean(Calculator.class);
			int result  = calculator.calc(argument.getA(), argument.getB());
			System.out.println("result = " + result);

		}
	}

}
