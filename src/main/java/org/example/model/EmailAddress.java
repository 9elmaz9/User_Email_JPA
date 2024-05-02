package org.example.model;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class EmailAddress {
    @Id
    private String id;

    @ManyToOne
    @JoinColumn(name="user-id")
    private User user;

    public EmailAddress(String id) {
        this.id = id;
    }

    public EmailAddress() {

    }
}