package com.bh.DI;

import com.bh.DI.Argument.ArgumentResolver;
import com.bh.DI.Argument.ScannerArgumentResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    Calculator calculator(){
        return new AddCalculator();
    }

    @Bean
    ArgumentResolver argumentResolver() {
        return new ScannerArgumentResolver();
    }
}
