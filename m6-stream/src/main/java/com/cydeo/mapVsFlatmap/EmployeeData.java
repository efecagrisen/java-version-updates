package com.cydeo.mapVsFlatmap;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> realAll(){
        return Stream.of(
                new Employee(100,"Mike" , "mike@cydeo.com", Arrays.asList("2022028765","7033263425")),
                new Employee(101,"Ozzy" , "ozzy@cydeo.com", Arrays.asList("2022588765","7848763425")),
                new Employee(102,"Peter" , "peter@cydeo.com", Arrays.asList("2022028855","7039163425"))

        );
    }
}
