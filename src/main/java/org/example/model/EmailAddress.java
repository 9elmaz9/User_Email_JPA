package org.example.model;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class EmailAddress {
    private String id;
    private User user;

    public EmailAddress(String id) {
        this.id = id;
    }
}