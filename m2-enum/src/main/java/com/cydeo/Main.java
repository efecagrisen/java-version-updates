package com.cydeo;

public class Main {
    public static void main(String[] args) {

        System.out.println("How to access a constant?");

        Currency c = Currency.DIME;
        System.out.println(c); // normally if we sout an object directly without toString it prints a hashcode (memory location) but ENUM has already overridden the toString method
        System.out.println(Currency.PENNY); // PENNY

        System.out.println("------------");

        System.out.println("How to get all constants?");
        Currency[] currencies = Currency.values(); // returns the array of constants, no need for new keyword. ENUM has values() method

        for (Currency currency: currencies){
            System.out.println(currency);
        }

        System.out.println("How to use switch-case with enums?");

        switch (Currency.PENNY){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cents");
                break;
            case DIME:
                System.out.println("It is 10 cents");
                break;
            case QUARTER:
                System.out.println("It is 25 cents");
                break;
        }



    }
}
