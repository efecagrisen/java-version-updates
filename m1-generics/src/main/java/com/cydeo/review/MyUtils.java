package com.cydeo.review;

import java.util.List;

public class MyUtils <T> {

    public void printList2 (List<T> personList){
        for(T person : personList){
            System.out.println(person);
        }
        System.out.println("Total person: "+personList.size());
    }

    public T getLastItem (List<T> list){
        return list.get(list.size()-1);

    }
}
