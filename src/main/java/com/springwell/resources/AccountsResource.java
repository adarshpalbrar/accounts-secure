package com.springwell.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AccountsResource {

    @GetMapping("/accounts")
    public String getAllAccounts() {
        return "Returning all accounts";
    }

    @GetMapping("/accounts/{userId}")
    public String getAccountByUser(@PathVariable String userId) {
        return "Returning accounts for user: " + userId;
    }
}
