package com.sapient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@SpringBootApplication
@EnableCassandraRepositories(basePackages = {"com.sapient.repository"})
public class InventoryApplication {
    public static void main(String[] args) {

        SpringApplication.run(InventoryApplication.class, args);
    }
}
