package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {
    public static void main(String[] args) {

        //ALL MATCH //boolean allMatch(Predicate<? super T> predicate);
        System.out.println("-----allMatch-----");
            boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories()<1000); // allMatch returns boolean
            System.out.println(isHealthy); //true because all are below 1000


        //ANY MATCH // boolean anyMatch(Predicate<? super T> predicate);
        System.out.println("-----anyMatch-----");
            if(DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        };
//0:26
        //NONE MATCH // boolean noneMatch(Predicate<? super T> predicate);
        System.out.println("-----noneMatch-----");
        boolean isHealthy2 = DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        //FIND ANY // Optional<T> findAny();
        System.out.println("-----findAny-----");
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish); //Optional[Dish(name=fries, vegetarian=true, calories=530, type=OTHER)]
        System.out.println(dish.get()); //Dish(name=fries, vegetarian=true, calories=530, type=OTHER)


        //FIND FIRST // Optional<T> findFirst();
        System.out.println("-----findFirst-----");
        Optional<Dish> dish2 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2); //Optional[Dish(name=fries, vegetarian=true, calories=530, type=OTHER)]
        System.out.println(dish2.get()); //Dish(name=fries, vegetarian=true, calories=530, type=OTHER)


        //PARALLEL STREAMS (Async) Difference between the two
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke","Jill","Dany","Jenish","Divya");

        Optional<String> findFirst = list1.parallelStream().filter(s->s.startsWith("D")).findFirst();
        Optional<String> findAny = list2.parallelStream().filter(s->s.startsWith("J")).findAny();

//        Optional<String> findFirst = list1.stream().filter(s->s.startsWith("D")).findFirst(); //David
//        Optional<String> findAny = list2.stream().filter(s->s.startsWith("J")).findAny(); //Jhonny

        System.out.println(findFirst.get()); //David
        System.out.println(findAny.get()); // Jill


        //MIN AND MAX
//        Optional<T> min(Comparator<? super T> comparator);
//        Optional<T> max(Comparator<? super T> comparator);
        System.out.println("-----min-----");
        Optional<Dish> dishMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dishMin.get());

        System.out.println("-----max-----");
        Optional<Dish> dishMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dishMax.get());






    }

}
