# Many-To-One/One-To-Many Relationship Example

![Relationship Visualization](https://i.pinimg.com/originals/66/9a/b9/669ab90dfd28b32c45430d27eea0882f.png)
This project illustrates a Many-To-One/One-To-Many relationship between User and EmailAddress objects in Java.

## Overview

In this scenario, we have two classes: `User` and `EmailAddress`.

### User Class

The `User` class represents a user entity. It contains the following attributes:
- `id` (int): Unique identifier for the user.
- `name` (String): Name of the user.
- `emailAddresses` (List<EmailAddress>): List of email addresses associated with the user.

### EmailAddress Class

The `EmailAddress` class represents an email address entity. It contains the following attributes:
- `id` (String): The email address itself, serving as the unique identifier.
- `user` (User): The user associated with this email address.

## Relationship

In this relationship:
- Each `User` can have multiple email addresses (One-To-Many).
- Each `EmailAddress` belongs to exactly one `User` (Many-To-One).
