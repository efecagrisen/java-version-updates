package com.cydeo.mapVsFlatmap;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class EmployeeTest {

    public static void main(String[] args) {

        //print all emails
        System.out.println("print all emails");
        EmployeeData.readAll()
//              .map(employee -> employee.getEmpEmail())
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);



        //print all phone numbers
        System.out.println("print all phone numbers");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                                        //    stream            of stream
    // <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper);
                .forEach(System.out::println);

        System.out.println("print all phone numbers with double colon");
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);


    }
}
