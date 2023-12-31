package com.cydeo.task;

import java.util.Comparator;
import java.util.stream.Stream;

public class DishTask {
    public static void main(String[] args) {

        // print all dishes' names which has less than 400 calories
        System.out.println("print all dishes' name less than 400 calories");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
              //.map(dish -> dish.getName()) // next line is with ::
                .map(Dish::getName)
                .forEach(System.out::println);


        System.out.println();
        // print the length of the name of each dish
        System.out.println("print the length of the name of each dish");
        DishData.getAll().stream()
                .map(Dish::getName)
              //.map(dish -> dish.length())
                .map(String::length)
                .forEach(System.out::println);


        System.out.println();
        // print three high caloric dish name (>300)
        System.out.println("print three high caloric dish name (>300)");
        DishData.getAll().stream()
                .filter(d -> d.getCalories()>300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);


        System.out.println();
        // print all dish name that are below 400 calories in sorted
        System.out.println("print all dish name that are below 400 calories in sorted");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                // Stream<String> means that you have only string in the stream anymore
                .forEach(System.out::println);

    }
}
