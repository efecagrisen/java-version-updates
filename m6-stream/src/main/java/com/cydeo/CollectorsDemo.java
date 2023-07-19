package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        // toCollection (Supplier) : is used to create a Collection using Collector
        List<Integer> numberList = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numberList); //[4, 6, 6]

        Set<Integer> numberSet = numbers.stream()
                .filter(x -> x%2==0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numberSet); //[4, 6] >>hashSet does not allow duplicates

        //toList(): returns a Collector interface that gathers the input data into a new List
        List<Integer> numberList2 = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());

        //toSet(): returns a Collector interface that gathers the input data into a new Set
        Set<Integer> numberList3 = numbers.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toSet());
        System.out.println(numberList3);

        //toMap(Function, Function) : returns a Collector interface that gathers the input data into a new Map
        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap); //{chicken=400, pizza=550, fruit=120, salmon=450, fries=530, beef=700, pork=800, rice=350, prawns=300}


        //summingInt(ToIntFunction) : returns a Collector interface that produces the sum of Integer-valued function
        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum); //4200

// 2:01:30













    }
}
