package com.cydeo.java9;

import java.util.*;

public class FactoryMethodsDemo {
    public static void main(String[] args) {

        // creating unmodifiable list before Java9
        List<String> courses = Collections.unmodifiableList(Arrays.asList("Java","Spring", "Agile"));
//        courses.add("TS");
        System.out.println(courses);


        // creating unmodifiable List after Java9
        List<String> myCourses = List.of("Java","Spring", "Agile");

        // creating unmodifiable Set after Java9
        Set<String> products = Set.of("Milk","Bread", "Butter");

        // creating unmodifiable Map after Java9
        Map<String,Integer> myCart = Map.ofEntries(
                Map.entry("Samsung TV",1),
                Map.entry("PSP",2),
                Map.entry("Chair",3));

    }

}
