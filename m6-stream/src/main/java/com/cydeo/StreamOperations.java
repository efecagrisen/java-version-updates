package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(12,24,20,36,3,3,3,4,4,4,5,5,5,6,6,8);
//        list.forEach(x -> System.out.println(x));
        list.forEach(System.out::println); // if it can be written with :: intelliJ highlights the code

//FILTER
System.out.println("-----FILTER-----");

        list.stream()                               // CREATING STREAM
                .filter(i -> i%2==0)                // INTERMEDIATE OPERATION //Stream<T> filter(Predicate<? super T> predicate);
                .forEach(System.out::println);      // TERMINAL //void forEach(Consumer<? super T> action);

//DISTINCT
System.out.println("-----DISTINCT-----");

        Stream<Integer> str =  list.stream()         // CREATING STREAM
                .filter(i -> i%2==0)                 // INTERMEDIATE OPERATION //Stream<T> filter(Predicate<? super T> predicate);
                .distinct();                         // INTERMEDIATE OPERATION //Stream<T> distinct();

                str.forEach(System.out::println);    // TERMINAL //void forEach(Consumer<? super T> action);

// 42:00

//LIMIT
System.out.println("-----LIMIT-----");

        list.stream()
                .filter(i -> i%2==0)
                .limit(1) // gives the first n number of elements
                .forEach(System.out::println);

//SKIP
System.out.println("-----SKIP-----");

        list.stream()
                .filter(i -> i%2==0)
                .skip(2) // skips the first n number of elements
                .forEach(System.out::println);

//MAP
        System.out.println("-----MAP-----");

        list.stream()
                .filter(i -> i%2==0)
                .map(i->i*3) // multiplies each element with 3, we can access each element with map // <R> Stream<R> map(Function<? super T, ? extends R> mapper);
                .forEach(System.out::println);

        //59:00
        System.out.println("-----------");
        list.stream()
                .map(number -> number*2) // multiplies each element with 2,
                .filter(i -> i%3==0) // return numbers divisible by 3
                .distinct() // return unique numbers
                .forEach(System.out::println);






    }

}
