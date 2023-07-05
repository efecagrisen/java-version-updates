package com.cydeo;

public enum Operation {

    PLUS,MINUS,MULTIPLY,DIVIDE; // each constant is object (new) of Operation

    Operation() {
        System.out.println("Constructor"); // printed Constructor 4 times
    }



}
