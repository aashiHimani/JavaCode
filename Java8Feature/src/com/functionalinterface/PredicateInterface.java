package com.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterface {
    String name, role;
    PredicateInterface(String a, String b) {
        name = a;
        role = b;
    }
    String getRole() { return role; }
    String getName() { return name; }
    public String toString() {
        return "User Name : " + name + ", Role :" + role;
    }
    public static List<PredicateInterface> process(List<PredicateInterface> users,Predicate<PredicateInterface> predicate){
        List<PredicateInterface> result=new ArrayList<PredicateInterface>();
        for (PredicateInterface user:users)
            if (predicate.test(user))
                result.add(user);
        return result;
    }

    static void pred(int number,Predicate<Integer> predicate){
        if (predicate.test(number)) {
            System.out.println("Number "+number);
        }
    }
    public static Predicate<String> hasLengthOf10=new Predicate<String>(){
        @Override
        public boolean test(String t){
            return t.length() > 10;
        }
    };
    public static void predicate_or()
    {
        Predicate<String> containsLetterA=p->p.contains("A");
        String containsA="And";
        boolean outcome=hasLengthOf10.or(containsLetterA).test(containsA);
        System.out.println(outcome);
    }
    public static void predicate_and(){
        Predicate<String> nonNullPredicate=Objects::nonNull;
        String nullString=null;
        boolean outcome=nonNullPredicate.and(hasLengthOf10).test(nullString);
        System.out.println(outcome);
        String lengthGTThan10="Welcome to the machine";
        boolean outcome2=nonNullPredicate.and(hasLengthOf10).test(lengthGTThan10);
        System.out.println(outcome2);
    }
    public static void predicate_negate(){
        String lengthGTThan10="Thunderstruck is a 2012 children's " + "film starring Kevin Durant";
        boolean outcome=hasLengthOf10.negate().test(lengthGTThan10);
        System.out.println(outcome);
    }

    public static void main(String[] args)
    {
        //simple
        Predicate<Integer> lesserthan=i->(i<18);
        System.out.println(lesserthan.test(10));

        //chaining
        Predicate<Integer> greaterThanTen=(i)->i>10;
        Predicate<Integer> lowerThanTwenty=(i)->i<20;
        boolean result=greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);
        boolean result2=greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);

        //predicate into function
        pred(10,(i)->i>7);

        //predicate OR
        predicate_or();

        //predicate AND
        predicate_and();

        //predicate negate
        predicate_negate();

        //collection
        List<PredicateInterface> users=new ArrayList<PredicateInterface>();
        users.add(new PredicateInterface("John","admin"));
        users.add(new PredicateInterface("Peter","member"));
        List admins=process(users,(PredicateInterface u)->u.getRole().equals("admin"));
        List admins1=users.stream().filter((user) -> user.getRole().equals("admin")).collect(Collectors.toList());
        System.out.println(admins);
        System.out.println(admins1);

    }
}
