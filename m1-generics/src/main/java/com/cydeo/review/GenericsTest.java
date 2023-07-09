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

        printList2(studentList);
        printList2(teacherList);

        MyUtils<Student> obj1 = new MyUtils<>();
        obj1.printList2(studentList);
        System.out.println(obj1.getLastItem(studentList));

        MyUtils<Teacher> obj2 = new MyUtils<>();
        obj2.getLastItem(teacherList);
        System.out.println(obj2.getLastItem(teacherList));


    }

    // write a method that takes a list of stuents prints each students and total sturdent type

    public static void printList (List<Student> studentList){
        for(Student student : studentList){
            System.out.println(student);
            }
        System.out.println("Total students: "+studentList.size());
    }

    public static <T> void printList2 (List<T> personList){
        for(T person : personList){
            System.out.println(person);
        }
        System.out.println("Total person: "+personList.size());
    }

    public static <T> T getLastItem (List<T> list){
        return list.get(list.size()-1);

    }


}
