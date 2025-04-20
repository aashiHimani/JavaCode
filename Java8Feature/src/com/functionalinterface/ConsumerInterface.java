package com.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        Consumer<Integer> consumer=a-> System.out.println(a);
        consumer.accept(10);

        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        Consumer<List<Integer>> listConsumer= l->{
            for(int i=0;i<l.size();i++){
                l.set(i,2*l.get(i));
            }
        };
        listConsumer.accept(list);

        Consumer<List<Integer>> display=li->li.stream().forEach(a-> System.out.print(a+" "));
        display.accept(list);
        System.out.println();

        //andThen
        listConsumer.andThen(display).accept(list);
        System.out.println();

        //Nullpointer exception is return
        try {
            listConsumer.andThen(null).accept(list);
            //display.andThen(listConsumer).accept(list);//handled exception
        }
        catch (Exception e){
            System.out.println("Exception:"+e);
        }


    }
}
