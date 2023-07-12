package com.cydeo.mapVsFlatmap;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Employee {

    private int empId;
    private String empName, empEmail;
    private List<String> empPhoneNumbers; // an employee can have more than one phone number


}
