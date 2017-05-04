package com.example.arielyust.test01application.dagger2.test01;

import javax.inject.Inject;

/**
 * Created by arielyust on 30/04/2017.
 */

public class User {
    private String firstName;
    private String lastName;

    @Inject
    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
