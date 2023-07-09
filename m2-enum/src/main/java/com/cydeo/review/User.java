package com.cydeo.review;

public class User {

    private String userName, firstName, lastName;
    private Roles roles;

    public User(String userName, String firstName, String lastName, Roles roles) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", roles=" + roles +
                '}';
    }
}

