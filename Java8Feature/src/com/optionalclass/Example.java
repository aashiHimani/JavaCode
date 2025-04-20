package com.optionalclass;

import java.util.Optional;

public class Example {
    public static void main(String[] args) {
        String[] str=new String[5];
        str[2]="Himu";
        Optional<String> empty=Optional.empty();
        System.out.println(empty);

        Optional<String> value=Optional.of(str[2]);
        System.out.println(value);
        System.out.println(value.get());
        System.out.println(value.hashCode());
        System.out.println(value.isPresent());

        //ofNullable
        Optional<Integer> op1=Optional.ofNullable(9455);
        System.out.println("Optional 1:"+ op1);
        Optional<Integer> op2=Optional.ofNullable(null);
        System.out.println("Optional 2:"+ op2);

        //orElse
        Optional<Integer> op3=Optional.of(9455);
        System.out.println("Optional:"+op3);
        System.out.println("Value by orElse"+"(100) method:"+op3.orElse(100));
        Optional<Integer> op4=Optional.empty();
        System.out.println("Optional:"+op4);
        try{
            System.out.println("Value by orElse"+"(100) method:"+op4.orElse(100));
        } catch (Exception e) {
            System.out.println(e);
        }

        //ifPresentOrElse
        Optional<Integer> op5=Optional.of(9455);
        System.out.println("Optional:"+op5);
        op5.ifPresentOrElse((value1)->{System.out.println("Value is present, its:"+ value1); },()
                        ->{ System.out.println("Value is empty");});
        Optional<Integer> op6=Optional.empty();
        System.out.println("Optional:"+op6);
        try{
            op6.ifPresentOrElse((value2)->{ System.out.println("Value is present, its:"+ value2);},()
                            ->{System.out.println("Value is empty");});
        }
        catch (Exception e){
            System.out.println(e);
        }

        //orElseGet
        Optional<Integer> op7=Optional.of(9455);
        System.out.println("Optional:"+op7);
        System.out.println("Value by orElseGet (Supplier) method:"+op7.orElseGet(()->(int)(Math.random() * 10)));
        Optional<Integer> op8=Optional.empty();
        System.out.println("Optional:"+op8);
        try {
            System.out.println("Value by orElseGet (Supplier) method:"+op8.orElseGet(()->(int)(Math.random() * 10)));
        }
        catch (Exception e) {
            System.out.println(e);
        }

        //filter
        Optional<Integer> op9=Optional.of(9456);
        System.out.println("Optional:"+op9);
        System.out.println("Filtered value for odd or even:"+op9.filter(num->num % 2 == 0));
        Optional<Integer> op10=Optional.empty();
        System.out.println("Optional:"+op10);
        try {
            System.out.println("Filtered value for odd or even:"+op10.filter(num->num % 2 == 0));
        }
        catch (Exception e) {
            System.out.println(e);
        }

        //or
        Optional<Integer> op=Optional.of(9455);
        System.out.println("Optional:"+op);
        System.out.println("Optional by or(() ->Optional.of(100)) method:"+op.or(() -> Optional.of(100)));


    }
}
