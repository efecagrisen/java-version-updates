package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,2,3,4,5,6,6,8);
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












    }

}
