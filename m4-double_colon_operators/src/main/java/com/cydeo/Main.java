package com.cydeo;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

Calculate sum = (x,y) -> System.out.println(x+y);


Calculate s1 = (x,y) -> Calculator.findSum(x,y);

// Reference to static method
Calculate s2 = Calculator ::findSum;
s2.calculate(10,30);

    }
}
