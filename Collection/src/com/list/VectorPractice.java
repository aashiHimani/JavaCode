package com.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorPractice {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        //add(Object element)
        vector.add("Hi");
        vector.add("Hello");
        //add(int index, Object element)
        vector.add(1,"Bye");
        //addElement(Object element)
        vector.addElement("last");
        System.out.println("add method: "+vector);

        //addAll(Collection C)
        //addAll(int index, Collection C)
        Vector<String> vector1=new Vector<>();
        vector1.add("Somu");
        vector1.add("Himu");
        vector.addAll(vector1);

        //capacity()
        System.out.println("return capacity:"+vector.capacity());

        //clear()
        //clone()
        //contains(Object element)
        //containsAll(Collection col)
        //copyInto(Object array[]) used to copy all of the components from this vector to another array, having enough space to hold all of the components of the vector
        String[] arr=new String[vector.size()];
        arr[0]="Hh";
        arr[1]="SS";
        for(String a:arr){
            System.out.println(a);
        }
        vector.copyInto(arr);
        for(String a:arr){
            System.out.println(a);
        }

        //elementAt(int pos)
        System.out.println("fetch element at pos:"+vector.elementAt(3));

        //elements() used to get the enumeration of the values present in the Vector.
        Enumeration enumeration=vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        //equals(Object obj)
        System.out.println("equal or not: "+vector.equals(vector1));

        //firstElement()
        System.out.println("first element: "+vector.firstElement());

        //get(int index)  set(int index, Object element)  setElementAt(E element, int index)
        //hashCode()
        //indexOf(Object element)  indexOf(Object element,inr index)
        //insertElementAt()
        //isEmpty()
        //lastElement()
        //lastIndexOf(Object element)
        //remove(int index)  remove(Object o)
        //removeAll(Collection col)
        //removeAllElements() method is used to removes all components from this Vector and sets its size to zero
        //removeElement() method is used to remove first occurrence of particular object
        //removeElementAt(int index)
        //removeIf(Predicate<? super E> filter)
        //removeRange(int fromIndex, int toIndex)
        //replaceAll(UnaryOperator<E> operator)
        //retainAll(Collection c)
        //retainAll(Collection c)
        //setSize(int newSize)  size()
        //spliterator()
        //subList(int low_index, int up_index)
        //toArray()   toArray(arr[])
        //toString()
        //trimToSize()
        //Collections.sort(vector)  Collections.sort(vector, Collections.reverseOrder())

    }
}
