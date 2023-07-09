package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Adam", 103));


        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Albus", 201));
        teacherList.add(new Teacher("Severus", 202));

        printList(studentList);

    }

    // write a method that takes a list of stuents prints each students and total sturdent type

    public static void printList (List<Student> studentList){
        for(Student student : studentList){
            System.out.println(student);
            }
        System.out.println("Total students: "+studentList.size());
    }


}
