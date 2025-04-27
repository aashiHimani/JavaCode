package com.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("Somu");
        list.add("Chimpu");
        list.add("Himu");

        //addFirst(Object element)
        list.addFirst("First");

        //addLast(Object element)
        list.addLast("last");

        //clone()
        LinkedList<String> clonelist=new LinkedList<>();
        clonelist= (LinkedList<String>) list.clone();
        System.out.println(clonelist);

        //descendingIterator()
        Iterator it=list.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //element() return head of list
        System.out.println(list.element());

        //getFirst()
        System.out.println(list.getFirst());

        //getLast()
        System.out.println(list.getLast());

        //offer(E e) add element at last
        list.offer("Aashi");

        //offerFirst(E e)
        list.offerFirst("Hi");

        //offerLast(E e)
        list.offerLast("Bye");

        //peek() fetch but does not remove
        System.out.println(list.peek());

        //peekFirst()
        System.out.println(list.peekFirst());

        //peekLast()
        System.out.println(list.peekLast());

        //poll() retrieves and removes the head
        System.out.println(list.poll());

        // pollFirst()
        System.out.println(list.pollFirst());

        //pollLast()
        System.out.println(list.pollLast());

        //push() similar to addFirst()
        //pop similar to removeFirst()
        //removeFirst()
        //removeLast()
        //removeFirstOccurrence()
        //removeLastOccurrence()


    }
}
