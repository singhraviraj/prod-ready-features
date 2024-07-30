package com.prod_ready_features.prod_ready_features.config;

import com.prod_ready_features.prod_ready_features.Auth.AuditorAwareImpl;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "getAuditorAware")
public class AppConfig {

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

    @Bean
    public AuditorAware<String> getAuditorAware(){
        return new AuditorAwareImpl();
    }
}
