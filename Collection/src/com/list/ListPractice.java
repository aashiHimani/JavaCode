package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        /*adding element use add() method
        this method is overloaded to perform multiple operations based on different parameter
        Returns-true if specified element is appended and list changes
        Exceptions-
        ClassCastException- When class of an element prevents it from being added to list
        NullPointerException- When element is Null and list doesn’t allow a null value.
        UnsupportedOperationException- When list doesn’t support add operation.
        IllegalArgumentException- When a property of an element prevents it from being added to a list.
        add(Object)-add element at the end of list
        add(int index,Object)-add element at a specific index of list */
        list.add(1);
        list.add(1,2);
        list.add(3);
        list.add(4);
        list.add(55);
        System.out.println("add element: "+list);

        //updating element(change element) use set(int index,Object) method
        list.set(4,0);
        System.out.println("update element: "+list);

       /* searching element use indexOf(), lastIndexOf() (return -1 if element is not found)
        indexOf() returns index of first occurrence of specified element in list
        lastIndexOf() return index of last occurrence of specified element */
        list.add(2);
        System.out.println("search element: "+list);
        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(2));

        /* removing element use remove() method
        this method is overloaded to perform multiple operations based on different parameter
        remove(Object)-if multiple object then remove first occurrence
        remove(int index) */
        list.remove(0);

        //accessing element use get(int index) method, return element at specified index
        System.out.println("get element: "+list.get(0));

        //checking element is present in list use contains(Object) method, return true if present
        System.out.println("element present: "+list.contains(2));

        //size() method, return count of element present in list
        System.out.println("lise size: "+list.size());

        //iterate
        for(int i=0;i<list.size();i++){
            System.out.print("iterate list: "+list.get(i)+ " ");
        }

        //hashcode() generate hashcode of given list
        System.out.println("hashcode: "+list.hashCode());

        //isEmpty() check list is empty or not. return true if list is empty
        System.out.println("empty list: "+list.isEmpty());

        //removeAll()
        System.out.println("remove all the element: "+list);

        //equals() compare two list, both list should have same size, all elements in two list are equal
        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        list1.add("Hi");
        list1.add("Hello");
        list2.add("Hi");
        list2.add("Hello");
        System.out.println("list is equal or not: "+list1.equals(list2));

        //sort()
        //list1.sort();

       /* containsAll() check if list contains all the collection of elements
        return true if all elements in collection are present
        throw NullPointerException if the specified collection is NULL */
        list1.add("Bye");
        System.out.println("containsall list: "+list1.containsAll(list2));

        //addAll(Collection c) append all element in specified collection to end of list
        list1.addAll(list2);
        System.out.println("add all the element: "+list1);
        list1.addAll(1,list2);
        System.out.println("add all the element at given index: "+list1);

        //clear() remove all element from list, doesn't delete
        list.clear();
        System.out.println("clear list: "+list);



    }
}
