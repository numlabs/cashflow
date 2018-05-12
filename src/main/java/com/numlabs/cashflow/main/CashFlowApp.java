package com.numlabs.cashflow.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
@EnableAutoConfiguration
public class CashFlowApp {

    public static void main(String[] args) {
        System.out.println("Starting CashFlow App!");
        SpringApplication.run(CashFlowApp.class, args);
        System.out.println("Started CashFlow App!");
    }
}
