package com.example.storemanagementapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class StoreManagementAPIApplication {

    public static void main(String[] args) {
        SpringApplication.run(StoreManagementAPIApplication.class, args);
    }

}
