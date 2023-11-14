package com.springwell.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ContactsResource {

    @GetMapping("/contacts")
    public String getAllContacts() {
        return "Returning all contacts";
    }

    @GetMapping("/contacts/{userId}")
    public String getContactByUser(@PathVariable String userId) {
        return "Returning contact for user: " + userId;
    }

}
