package org.example;

import org.example.model.EmailAddress;
import org.example.model.User;

//Many-To-One/One-To-Many
//Je maakt een Object User, met String name en int id. En je maakt een Object EmailAdress. De
//emailaddress zelf is de Id

//You create an Object User, with String name and int id. And you create an Object EmailAddress. The email address itself is the Id.
//Which of the two maintains the relationship? And why?


//Welke van de twee houdt de relatie bij? En waarom?
public class Main {
    public static void main(String[] args) {
        // Create email addresses
        EmailAddress email1 = new EmailAddress("rob@gmail.com");
        EmailAddress email2 = new EmailAddress("mila@mail.com");
        EmailAddress email3 = new EmailAddress("rob.roy@gmail.com");

        // Create users
        User user1 = new User(1, "Rob");
        User user2 = new User(2, "Mila");

        // Associate email addresses with users
        user1.addEmailAddress(email1);
        user2.addEmailAddress(email2);
        user1.addEmailAddress(email3); // rob has multiple email addresses

        // Print user information along with associated email addresses
        System.out.println("User: " + user1.getName());
        System.out.println("ID: " + user1.getId());
        System.out.println("Email Addresses:");
        for (EmailAddress emailAddress : user1.getEmailAddresses()) {
            System.out.println("- " + emailAddress.getId());
        }

        System.out.println("\nUser: " + user2.getName());
        System.out.println("ID: " + user2.getId());
        System.out.println("Email Addresses:");
        for (EmailAddress emailAddress : user2.getEmailAddresses()) {
            System.out.println("- " + emailAddress.getId());
        }
    }
}

