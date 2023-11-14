package com.springwell;

import com.springwell.model.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountsSecureApplication {

    public static void main(String[] args) {

        SpringApplication.run(AccountsSecureApplication.class, args);
    }
}
