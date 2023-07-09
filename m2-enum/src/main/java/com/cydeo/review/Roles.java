package com.cydeo.review;

public enum Roles {
    ADMIN ("Admin"),MANAGER ("Manager"),EMPLOYEE("Employee"); // new Role ("Employee")

    public String value;

    Roles(String value) {
        this.value = value;
    }
}
