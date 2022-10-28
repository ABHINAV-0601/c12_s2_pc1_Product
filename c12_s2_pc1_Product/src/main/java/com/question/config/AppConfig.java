package com.question.config;

import com.question.domain.Product;
import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean("nescafe")
    public Product getProduct1(){
        return new Product(101,"Nescafe",50.65);
    }

    @Bean("bru")
    public Product getProduct2(){
        return new Product(102,"Bru",45.99);
    }
}
