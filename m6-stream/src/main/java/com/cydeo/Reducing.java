package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);

        int sum = 0;
        for (int number : numbers){
            sum = sum + number;
        }

        int result = numbers.stream().reduce(0,(a,b) -> a+b); //the same as above
        Optional<Integer> result2 = numbers.stream().reduce((a, b) -> a+b); //without initial value

        System.out.println(result);
        System.out.println(result2);


        int totalCalories = DishData.getAll().stream()
                .map(Dish::getCalories)
                .reduce((a,b) -> a+b)
                .get();
        System.out.println(totalCalories);

















}
}
