package org.example.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class User {
    private String name;
    private int id;
    private List<EmailAddress> emailAddresses;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.emailAddresses = new ArrayList<>();
    }

    public void addEmailAddress(EmailAddress emailAddress) {
        this.emailAddresses.add(emailAddress);
    }
}