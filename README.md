# Many-To-One/One-To-Many Relationship 

![Relationship Visualization](https://i.pinimg.com/originals/66/9a/b9/669ab90dfd28b32c45430d27eea0882f.png)
# Many-To-One/One-To-Many Relationship in Java

## Overview

This repository illustrates a Many-To-One/One-To-Many relationship between User and EmailAddress objects in Java.

## User Class

The `User` class represents a user entity, encapsulating the following attributes:

- **id** (int): Unique identifier for the user.
- **name** (String): Name of the user.
- **emailAddresses** (List<EmailAddress>): List of email addresses associated with the user.

## EmailAddress Class

The `EmailAddress` class represents an email address entity, containing the following attributes:

- **id** (String): The email address itself, serving as the unique identifier.
- **user** (User): The user associated with this email address.

## Relationship

In this relationship:

- Each User can have multiple email addresses (One-To-Many).
- Each EmailAddress belongs to exactly one User (Many-To-One).

## Annotations and Configuration

The classes use the following annotations and configurations:

- `@Entity`: Marks the classes as JPA entities.
- `@Table`: Specifies the table name for the entities.
- `@Id`: Defines the primary key.
- `@GeneratedValue`: Specifies the generation strategy for the primary key.
- `@ManyToOne` and `@OneToMany`: Define the relationships between entities.
- `@JoinColumn`: Specifies the foreign key column name.
- `cascade = CascadeType.ALL`: Specifies that operations should be cascaded to associated entities.

Make sure to adjust the annotations and column names according to your database schema.
