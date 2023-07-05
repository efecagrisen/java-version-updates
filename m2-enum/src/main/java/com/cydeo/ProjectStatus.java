package com.cydeo;

public enum ProjectStatus {

    OPEN,CLOSED,PROGRESS("IN PROGRESS"); //if we want to see the status progress as "in progress" we can assign a value with a constructor.

    String status;

    ProjectStatus(String status) {
        this.status = status;
    }

    ProjectStatus() { // to avoid compile error due to the first constructor which requires an argument, we define another constructor without an argument
    }
}
