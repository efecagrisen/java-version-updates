package com.cydeo;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Calculate sum = (x,y) -> System.out.println(x+y);


        Calculate s1 = (x,y) -> Calculator.findSum(x,y);

        // Reference to static method
        Calculate s2 = Calculator ::findSum;
        s2.calculate(10,30);

        // Reference to an instance method
        Calculator obj = new Calculator();
        Calculate s3 = obj::findMultiply;
        // line 19 and 21 is calling the same method.
        Calculate s4 = new Calculator()::findMultiply;

        s3.calculate(12,5);

        BiFunction<String,Integer,String> func = (str,i) -> str.substring(i);

        BiFunction<String,Integer,String> func2 = String::substring;

        Function<Integer, Double > b = new MyClass()::method; // calling the static method with an object
        BiFunction<MyClass,Integer,Double> b1 = MyClass::method; // BiFunction takes 3 args and the first arg is already makes the object clear, so the instance method can be directly called without creating a new object.

        Consumer<Integer> display = i -> System.out.println(i);
        Consumer<Integer> display2 = System.out  ::  println;
//                                 static portion   method name





    }
}
