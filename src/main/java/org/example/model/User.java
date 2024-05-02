package org.example.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "id")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String name;
    private int id;
    @OneToMany(mappedBy = "emailAddress",cascade =CascadeType.ALL )
    private List<EmailAddress> emailAddresses;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.emailAddresses = new ArrayList<>();
    }

    public User() {

    }

    public void addEmailAddress(EmailAddress emailAddress) {
        this.emailAddresses.add(emailAddress);
    }
}