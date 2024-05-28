package com.cahing.redis;

import com.cahing.redis.entitiy.Customer;
import com.cahing.redis.repository.CustomerRepo;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }

    @Bean
    public ApplicationRunner runner (CustomerRepo customerRepo){
        return args -> {
            Customer customer = new Customer("02920393","Ahmet Temel");
            customerRepo.save(customer);
            Customer retrivedCustomer = customerRepo.findById("02920393").get();
            System.out.println(retrivedCustomer.toString());
        };
    }
}
