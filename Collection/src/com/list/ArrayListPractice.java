package com.list;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        list.add("Somu");
        list.add("Himu");
        list.add("Somu");
        list1.add("Soumya");
        list1.add("Himani");

        //add(Object o)
        list2.add("Hi");
        list2.add("Hello");

        //add(int index, Object element)
        list2.add(1,"Bye");
        System.out.println("Add method: "+list2);

        //addAll(Collection c)
        System.out.println("AddAll method: "+list.addAll(list1)+"/n"+list);

        //addAll(int index, Collection c)
        System.out.println("AddAll method: "+list1.addAll(1,list2)+"/n"+list2);

        //clear()
        list1.clear();
        System.out.println("after clear:"+list1);

        //clone() creation of an exact copy of object. it creates new instance of class of current object
        list1=list;
        System.out.println("after cloning: "+list1);

        //contains((
        System.out.println("It contains or not:"+list.contains("Hi"));

        //ensureCapacity(int minCapacity)
        try{
            ArrayList<Integer> arr=new ArrayList<>();
            arr.add(1);
            arr.add(2);
            arr.add(3);
            arr.add(4);
            System.out.println("ensure capacity before:"+arr);
            arr.ensureCapacity(10);
            System.out.println("now arraylist can store 10 element");
        }
        catch (NullPointerException e){
            System.out.println(e);
        }

        //forEach(Consumer<? super E> action)
        list.forEach(n->System.out.println(n));

        //get(index)
        System.out.println("get method: "+list.get(1));

        //IndexOf(Object o)
        System.out.println("indexOf method: "+list.indexOf("Somu"));

        //lastIndexOf(element)
        System.out.println("lastIndexOf method: "+list.lastIndexOf("Somu"));

        //isEmpty()
        System.out.println("isEmpty method: "+list.isEmpty());

        //listIterator()
        ListIterator<String> it=list2.listIterator();
        while (it.hasNext()){
            System.out.print("iterator method: "+it.next()+" ");
        }

        //listIterator(int index)
        ListIterator<String> it1=list2.listIterator(1);
        while (it1.hasNext()){
            System.out.print("iterator method with index: "+it1.next()+" ");
        }

        //remove(Object obj)
        System.out.print("remove object: "+list2.remove("Bye"));

        //remove(int index)
        System.out.print("remove object at index: "+list2.remove(1));

        //removeAll(Collection c)
        System.out.println("removeAll method:"+list.removeAll(list1));

        //removeIf(Predicate filter)
        System.out.println("remove if :"+list2.removeIf(n->n.charAt(0)=='H'));

        //removeRange(int fromIndex, int toIndex)
        //size()
        //set(int index, E element)
        //trimToSize() trims the capacity of an ArrayList instance to be the list’s current size
        ArrayList<Integer> arr=new ArrayList<>(5);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.trimToSize();
        System.out.println(arr);

        //subList(int fromIndex(inclusive), int toIndex(exclusive))
        //retainAll(Collection C) remove all list which are not contain in specified collection
        //spliterator() Splitting + Iterator
        Spliterator<String> spliterator=list.spliterator();
        spliterator.forEachRemaining(n->System.out.println(n));

    }
}
