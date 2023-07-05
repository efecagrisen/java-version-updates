package com.cydeo;

public enum Currency { // ENUM extends to ENUM class and it inherits some useful methods already

    PENNY(1),NICKLE(5),DIME(10),QUARTER(25);
    // everything we put in ENUM is an object of this class. ";" is not mandatory if there is no value assigned
        private int value;

    Currency(int value) { // constants can be assigned a value by a constructor
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
