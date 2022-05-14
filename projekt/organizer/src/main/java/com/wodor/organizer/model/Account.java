package com.wodor.organizer.model;

import java.net.PasswordAuthentication;
import java.util.UUID;

public class Account {

    private final UUID id;
    private final String firstName;
    private final String lastName;
    private String email;
    private PasswordAuthentication passwordAuthentication;


    public Account(UUID id, String firstName, String lastName, String email, PasswordAuthentication passwordAuthentication) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passwordAuthentication = passwordAuthentication;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

