package com.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerInterface {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(1);
        list1.add(3);

        List<Integer> list2=new ArrayList<>();
        list2.add(2);
        list2.add(1);
        list2.add(2);

        // BiConsumer to compare 2 lists of integers
        BiConsumer<List<Integer>,List<Integer>> equals=(l1,l2)->{
            if (l1.size()!=l2.size()) {
                System.out.println("False");
            }
            else {
                for (int i=0;i<l1.size();i++)
                    if (l1.get(i)!=l2.get(i)) {
                        System.out.println("False");
                        return;
                    }
                System.out.println("True");
            }
        };
        equals.accept(list1,list2);

        // BiConsumer to print 2 lists
        BiConsumer<List<Integer>,List<Integer>> disp=(l1,l2)->{
            l1.stream().forEach(a->System.out.print(a+" "));
            System.out.println();
            l2.stream().forEach(a->System.out.print(a+" "));
            System.out.println();
        };

        // Using addThen() method
        equals.andThen(disp).accept(list1, list2);

        try {
            equals.andThen(null).accept(list1, list2);
            //disp.andThen(equals).accept(list1, list2);
        }
        catch (Exception e) {
            System.out.println("Exception:"+ e);
        }
    }
}
