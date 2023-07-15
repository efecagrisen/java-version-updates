package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Optional;

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







    }

}
